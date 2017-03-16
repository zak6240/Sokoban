import java.io.IOException;
import java.util.Scanner;

	public class Main {
		public static void main (String [] args) throws IOException
		{	Test t =new Test("levels/level_1.xsb");
			int var=-1;
			t.afficher();
			do{
				Scanner x=new Scanner(System.in);
				var= x.nextInt();
				switch(var){
				
				case 8:	
					t.up();
					t.afficher();
					break;
				case 4:
					t.left();
					t.afficher();
					break;
				case 6:
					t.right();
					t.afficher();
				case 2 :
					t.down();	
					t.afficher();
				
				}
				
			}while(var!=0);

			
		}

		

	}

