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
	
	/**
	 * @param points : Indique le nombre de points
	 * Initialise le nombre de points à 0
	 */
	public void InitPoints(int points)
	{
		points=0;
	}
	
	/**
	 * @param lignes : Indique le nombre de lignes
	 * Initialise le nombre de lignes à 0
	 */
	public void InitLignes(int lignes)
	{
		lignes=0;
	}
	
	/**
	 * Gère l'evolution des points
	 */
	public void EvolutionPoints() 
	{		
		
	}
	
	/**
	 * Gère l'evolution des lignes
	 */
	public void EvolutionLignes()
	{
		
	}

}
