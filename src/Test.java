
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;

	public class Test{

		protected int abs_player;
		protected int ord_player;
		protected int ii,jj;
		protected char tab_level[][];
		private String Random;
		
		public Test(String fname)
			throws IOException 
			{	
				int abs=0; //nombre de ligne du tableau de niveau
				ArrayList<String> tab = new ArrayList<String>(); //pour stoker les elem du fichier
				File f = new File (fname);
				FileReader fr = new FileReader (f);
				BufferedReader br = new BufferedReader (fr);
			try {
						// 
						String line = br.readLine();
						int col=line.length();  //nombre col du tabl
						while (line != null)
						{
							
							tab.add(line);
							line = br.readLine();
							if(line!=null && (line.length())>col){
								col=line.length();
							}
							abs++;

						}
					//	System.out.print(col);
						tab_level=new char [abs][col];
						ii=abs;
						jj=col;
						for(int i=0;i<tab.size();i++)
						{
							for (int j=0;j<tab.get(i).length();j++)
							{
								tab_level[i][j]=tab.get(i).charAt(j); //copie des elements de ma arraylis dans mon tableau
								
								if(tab_level[i][j]=='@')
								{
									abs_player=i;  //lors de la copie on cherche la position du joueur
									ord_player=j;
								}
							}
						}
					}
			        finally 
			        {
			        		// On ferme le flux
			        		br.close();
			        		fr.close();
			        }
		


		}


		public void afficher() {

			for(int i=0;i<ii;i++)
			{
				for (int j=0;j<jj;j++)
				{
					System.out.print(tab_level[i][j]);
				}
				System.out.print('\n');
			}
			
		}
		public void up(){
			if(abs_player-1>0 && tab_level[abs_player-1][ord_player]==' '){
				tab_level[abs_player-1][ord_player]=tab_level[abs_player][ord_player];
				tab_level[abs_player][ord_player]=' ';
				abs_player--;
			}
			else if(tab_level[abs_player-1][ord_player]=='$'){
				if(tab_level[abs_player-2][ord_player]==' '){
					tab_level[abs_player-2][ord_player]=tab_level[abs_player-1][ord_player];
					tab_level[abs_player-1][ord_player]=tab_level[abs_player][ord_player];
					tab_level[abs_player][ord_player]=' ';
					abs_player--;
				}
			}

			
		}
		
		public void down(){
			if(abs_player<ii-1 && tab_level[ii-1][ord_player]==' '){
				tab_level[ii-1][ord_player]=tab_level[abs_player][ord_player];
				tab_level[abs_player][ord_player]=' ';
			}
			else if(tab_level[ii-2][ord_player]=='$'){
				if(tab_level[ii-1][ord_player]==' '){
					tab_level[abs_player-2][ord_player]=tab_level[abs_player-1][ord_player];
					tab_level[abs_player-1][ord_player]=tab_level[abs_player][ord_player];
					tab_level[abs_player][ord_player]=' ';
				}
			}
			abs_player++;
			
		}
		
		public void left(){
			if(ord_player-1>0 && tab_level[abs_player][ord_player-1]==' '){
				tab_level[abs_player][ord_player-1]=tab_level[abs_player][ord_player];
				tab_level[abs_player][ord_player]=' ';
				ord_player--;
			}
			else if(tab_level[abs_player][ord_player-1]=='$'){
				if(tab_level[abs_player][ord_player-2]==' '){
					tab_level[abs_player][ord_player-2]=tab_level[abs_player][ord_player-1];
					tab_level[abs_player][ord_player-1]=tab_level[abs_player][ord_player];
					tab_level[abs_player][ord_player]=' ';
					ord_player--;
				}
			}

			
		}
		
		public void right(){
			if(abs_player-1>0 && tab_level[abs_player-1][ord_player]==' '){
				tab_level[abs_player-1][ord_player]=tab_level[abs_player][ord_player];
				tab_level[abs_player][ord_player]=' ';
			 
			}
			else if(tab_level[abs_player-1][ord_player]=='$'){
				if(tab_level[abs_player-2][ord_player]==' '){
					tab_level[abs_player-2][ord_player]=tab_level[abs_player-1][ord_player];
					tab_level[abs_player-1][ord_player]=tab_level[abs_player][ord_player];
					tab_level[abs_player][ord_player]=' ';
				}
			}
			ord_player++;
			
		}
		
		
	}
