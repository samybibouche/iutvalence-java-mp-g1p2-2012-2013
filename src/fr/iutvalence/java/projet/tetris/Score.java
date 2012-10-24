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
	// FIXME (FIXED) le nombre de points est il seulement lié au nombre de lignes ou peut-on marquer des points sans faire de
	// ligne ?
	/**
	 * 
	 * Les Points font parti du Score avec les Lignes
	 * 
	 * Cet attribut indique le nombre de points
	 * 
	 * Le nombre de points est seulement lié au nombres de lignes complétées
	 * 1 Ligne = 20 Points
	 * 2 Ligne = 60 Points
	 * 3 Ligne = 130 Points
	 * 4 Ligne = 200 Points 
	 * 
	 */
	private int points;

	/**
	 * 
	 * Les Lignes font parti du Score avec les Points
	 * 
	 * Cet attribut indique le nombre de lignes complétés
	 * 
	 * On peut complétés 4 lignes en meme temps au maximum
	 * 
	 */
	private int lignes;

	
	
	// FIXME (FIXED) si les paramètres du constructeur ne servent à rien, il faut les retirer
	
	/**
	 * Un Constructeur pour initialiser les Scores à 0
	 * 
	 * Les deux types de scores 
	 *     les lignes : correspondent au nombre de lignes complétés
	 *     les points : correspondent au nombre de points complétés
	 * 
	 */
	public Score()
	{
		this.lignes = 0;
		this.points = 0;
	}


	
	// FIXME (FIXED) définir des getters sur les attributs
	
	/**
	 * Un getter pour l'attribut Points
	 * 
	 * @return : Un nombre de points 
	 * 
	 */

	
	public int getPoints ()
	{
		return this.points;
	}

	/**
	 * Un getter pour l'attribut Lignes
	 * 
	 * @return : Un nombre de lignes
	 */
	public int getLignes()
	{
		return this.lignes;
	}

	
	// FIXME Le score est une simple structure de données, il faut des méthodes permettant de faire évoluer le score
	// d'un certain incrément
	
	
	/**
	 * Gère l'evolution du Score
	 */
	public void ajoutScore()
	{
		/*
		 * Si un certain nombre de lignes (compris entre 1 à 4) est rempli ( de 1)
		 *  */
		 // if (???) // Si une ligne est complete { this.points=this.points+20; this.lignes=this.lignes+1; }
		  
		 // if (???) // Si deux lignes sont completes { this.points=this.points+60; this.lignes=this.lignes+2; }
		  
		 // if (???) // Si trois lignes sont completes { this.points=this.points+130; this.lignes=this.lignes+3; }
		 
		 // if (???) // Si quatre lignes sont completes { this.points=this.points+200; this.lignes=this.lignes+4; }
		 
		  
		 //}
		

	}

	
	
	// FIXME (FIXED) redéfinir toString
	
	public String toString()
	{
		// TODO Auto-generated method stub		
		return "SCORE \n"+"POINTS :"+this.points+"\nLIGNES"+this.lignes;
	}

}


