import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Windows extends JFrame
{
	  public static void main(String[] args)
	  {
		  Windows fenetre=new Windows();
	  }
	  public Windows()  
	  {	
	    this.setTitle("Sokoban");
	    this.setSize(1000, 1000);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	  }

}

