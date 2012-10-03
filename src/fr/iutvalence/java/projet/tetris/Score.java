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
	//il faut écrire un constructeur qui initialise les attributs 
	/**
	 * @param points : Indique le nombre de points
	 * Initialise le nombre de points à 0
	 */
	public void InitPoints(int points)
	{
		points=0;
	}
	
	// FIXME au lieu d'écrire cette méthode, 
	//il faut écrire un constructeur qui initialise les attributs
	/**
	 * @param lignes : Indique le nombre de lignes
	 * Initialise le nombre de lignes à 0
	 */
	public void InitLignes(int lignes)
	{
		lignes=0;
	}
	
	// FIXME les points evoluent seuls, 
	//sans information passée depuis l'extérieur ?
	/**
	 * Gère l'evolution des points
	 */
	public void EvolutionPoints() 
	{		
		
	}

	// FIXME les lignes evoluent seules, sans information 
	//passée depuis l'extérieur ?
	/**
	 * Gère l'evolution des lignes
	 */
	public void EvolutionLignes()
	{
		
	}

}
