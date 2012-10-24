package fr.iutvalence.java.projet.tetris;

/**
 * 
 * Calcul et indique le Score de la partie en cours
 * 
 * Le Score est composé de Points et de Lignes Ligne correspond au nombre de lignes éliminés
 * 
 * @author benmessa
 * 
 */

public class Score
{
	// FIXME le nombre de points est il seulement lié au nombre de lignes ou peut-on marquer des points sans faire de
	// ligne ?
	/**
	 * Indique le nombre de points
	 */
	private int points;

	/**
	 * Indique le nombre de lignes
	 */
	private int lignes;

	// FIXME si les paramètres du constructeur ne servent à rien, il faut les retirer
	/**
	 * Constructeur Initialise les Scores à 0
	 * 
	 * @param lignes
	 * @param points
	 * 
	 */
	public Score(int lignes, int points)
	{
		this.lignes = 0;
		this.points = 0;
	}

	// FIXME Le score est une simple structure de données, il faut des méthodes permettant de faire évoluer le score
	// d'un certain incrément
	// FIXME définir des getters sur les attributs

	/**
	 * Gère l'evolution du Score
	 */
	public void ajoutScore()
	{
		/*
		 * Si un certain nombre de lignes (compris entre 1 à 4) est rempli ( de 1)
		 * 
		 * if (???) // Si une ligne est complete { this.points=this.points+20; this.lignes=this.lignes+1; }
		 * 
		 * if (???) // Si deux lignes sont completes { this.points=this.points+60; this.lignes=this.lignes+2; }
		 * 
		 * if (???) // Si trois lignes sont completes { this.points=this.points+130; this.lignes=this.lignes+3; }
		 * 
		 * if (???) // Si quatre lignes sont completes { this.points=this.points+200; this.lignes=this.lignes+4; }
		 * 
		 * 
		 * }
		 */

	}

	// FIXME redéfinir toString

}
