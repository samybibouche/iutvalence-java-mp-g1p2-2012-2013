package fr.iutvalence.java.projet.tetris;
/**
 * Une Classe permettant de gérer les Tetriminos ainsi que leurs permutations
 * 
 * @author benmessa
 * 
 */
public class Tetrimino
{
	// FIXME corriger le commentaire
	/**
	 * Tableau Forme contenant les 19 formes de Tetrimino possible
	 * 
	 */
	public Forme[] formes;

	// FIXME si les pièces ne tournent que dans un sens, on peut se passer de ce tableau
	/**
	 * Tableau qui permet de gérer les permutations des Tetriminos qui tournent dans plus d'un sens
	 */
	public int[] permutations;

	// char [][] Forme = new char[][]
	// {{0,'1','0','0','0'},{'0','1','0','0','0'},{'0','1','0','0','0'},{'0','1','0','0','0'}};

	/**
	 * Construit un Tetrimino à partir du tableau Forme et du tableau permutation
	 * 
	 * @param formes
	 *            : Tableau contenant les Formes
	 * @param permutations
	 *            : Tableau contenant
	 */
	public Tetrimino(Forme[] formes, int[] permutations)
	{
		this.formes = formes;
		this.permutations = permutations;
	}

	// FIXME redéfinir toString

	// FIXME ajouter des méthodes pour faire tourner le tétrimino, obtenir la forme courante
}
