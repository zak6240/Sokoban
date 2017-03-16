/*public class GameController {
	 
		public void onKeyDown (KeyboardEvent event) {
		  switch (event.KeyPressed) {
		  case KEY_UP:
		    joueur.y_step=-1; //on se déplace vers le haut
		    break;
		  case KEY_DOWN:
		    joueur.y_step=+1; //on se déplace vers le bas
		    break;
		  case KEY_LEFT:
		    joueur.x_step=-1; //on se déplace vers la gauche
		    break;
		  case KEY_RIGHT:
		    joueur.x_step=+1; //on se déplace vers la droite
		    break;
		  }
		}


	  public void onKeyUp (KeyboardEvent event) {
	  switch (event.KeyPressed) {
	  case KEY_UP:
	    joueur.y_step=0;    break;
	  case KEY_DOWN:
	    joueur.y_step=0;    break;
	  case KEY_LEFT:
	    joueur.x_step=0;    break;
	  case KEY_RIGHT:
	    joueur.x_step=0;    break;
	  }
	}
}
