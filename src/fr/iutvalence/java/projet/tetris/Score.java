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
	private static int points;

	/**
	 * 
	 * Les Lignes font parti du Score avec les Points
	 * 
	 * Cet attribut indique le nombre de lignes complétés
	 * 
	 * On peut complétés 4 lignes en meme temps au maximum
	 * 
	 */
	private static int lignes;

	
	
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

	/**
	 * Un getter pour l'attribut Points
	 * 
	 * @return : Un nombre de points 
	 * 
	 */
	
	public static int getPoints ()
	{
		return points;
	}
	

	/**
	 * Un getter pour l'attribut Lignes
	 * 
	 * @return : Un nombre de lignes
	 */
	public static int getLignes()
	{
		return lignes;
	}

	


	public String toString()
	{
		// TODO Auto-generated method stub		
		return "SCORE \n"+"POINTS :"+this.points+"\nLIGNES"+this.lignes;
	}

}



