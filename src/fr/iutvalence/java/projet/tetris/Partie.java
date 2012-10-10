package fr.iutvalence.java.projet.tetris;

/**
 * @author benmessa
 * Indique l'etat de la partie
 */
public class Partie
{
	
	
	// FIXME ne pas rappeler le nom de l'attribut/méthode dans le 
	//commentaire JavaDoc (FIXED)
	
	
	// FIXME les noms d'attributs commencent par une minuscule (FIXED)
	
	/**
	 * Indique si la partie est en cours
	 * ou est terminé
	 */
	public boolean etatPartie;
	
	
	// FIXME les noms de méthodes commencent par une minuscule (FIXED)
	
	/**
	 * Indique que la partie à demarrer
	 */
	public void demarrerPartie()
	{
		while (this.etatPartie == true)
		{
			/*if (???) // Si un Tetrimino arrive à la 21eme ligne de la Grille (Correspond à un GAME OVER)
			{
			etatPartie=false;
			}*/
			
		}
	}
	
	
	// FIXME peut-on vraiment décider de l'extérieur que la partie est terminée ? 
	// NON, on ne peut pas décider de l'extérieur (FIXED)
	

	
	
}
