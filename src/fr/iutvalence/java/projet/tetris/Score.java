package fr.iutvalence.java.projet.tetris;


/**
 * @author benmessa
 * Calcul et indique le Score 
 * de la partie en cours
 * 
 * Le Score est composé de Points et de Lignes
 * Ligne correspond au nombre de lignes éliminés
 * 
 */

public class Score
{
	
	/**
	 * Indique le nombre de points
	 */
	public int points;
	
	
	/**
	 * Indique le nombre de lignes
	 */
	public int lignes;
	
	// FIXME au lieu d'écrire cette méthode, 
	//il faut écrire un constructeur qui initialise les attributs  (FIXED)
	
	/**
	 * Constructeur 
	 * Initialise les Scores à 0
	 * 
	 */
	public Score()
	{
		this.lignes=0;
		this.points=0;
	}
	
	
	// FIXME les points evoluent seuls, 
	//sans information passée depuis l'extérieur ?
	
	// FIXME les lignes evoluent seules, sans information 
	//passée depuis l'extérieur ?
	
	
	/**
	 * Gère l'evolution du Score
	 */
	public void ajoutScore() 
	{		
		/* Si un certain nombre de lignes (compris entre 1 à 4) est rempli ( de 1)

		 if (???) // Si une ligne est complete 
		 {
		 this.points=this.points+20;
		 this.lignes=this.lignes+1;
		 }
		 
		 if (???) // Si deux lignes sont completes
		 {
		 this.points=this.points+60;
		 this.lignes=this.lignes+2;
		 }
		 
		 if (???) // Si trois lignes sont completes 
		 {
		 this.points=this.points+130;
		 this.lignes=this.lignes+3;
		 }
		 
		 if (???) // Si quatre lignes sont completes
		 {
		 this.points=this.points+200;
		 this.lignes=this.lignes+4; 
		 }
		 
		 		 
		 }*/
		
	}

	
	
	
}
