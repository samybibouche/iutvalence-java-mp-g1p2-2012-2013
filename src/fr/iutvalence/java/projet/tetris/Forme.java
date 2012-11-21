package fr.iutvalence.java.projet.tetris;

/**
 * Une classe qui permet de générer les formes de chaque Tetrimino
 * 
 * @author benmessa
 */
public class Forme
{

	// FIXME définir les valeurs par des constantes ou utiliser le type booléen
	// FIXME définir l'attribut en private
	/**
	 * Tableau à deux dimensions d'entiers, les valeurs que peuvent prendre les cases sont 1 ou 0 1 si la case est
	 * rempli et 0 si la case est vide
	 */
	private int[][] tab;

	// FIXME (not fixed) compléter le commentaire (indiquer dans quel état est l'objet construit)
	/**
	 * @param tab
	 *            : Un tableau rempli de valeurs 1 et 0 déterminant la forme du Tetrimino
	 */
	public Forme(int[][] tab)
	{
		this.tab = tab;
	}

	// FIXME redéfinir toString
	//public String toString()
	//{
}
