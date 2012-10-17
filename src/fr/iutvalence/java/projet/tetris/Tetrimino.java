package fr.iutvalence.java.projet.tetris;

// FIXME (FIXED) compléter le commentaire
/**
 * @author benmessa
 * 
 * Une Classe permettant de gérer les Tetriminos ainsi que leurs permutations
 *
 */
public class Tetrimino
{
		// FIXME (FIXED) compléter le commentaire
		/**
		 * Tableau Forme contenant les 19 formes de Tetrimino possible
		 * 
		 */
		public Forme [] formes;
		
		// FIXME (FIXED) compléter le commentaire
		/**
		 * Tableau qui permet de gérer les permutations
		 */
		public int [] permutations;



		//char [][] Forme = new char[][] {{0,'1','0','0','0'},{'0','1','0','0','0'},{'0','1','0','0','0'},{'0','1','0','0','0'}};
	
		
		// FIXME (FIXED) compléter le commentaire
		/**
		 * Construit un Tetrimino à partir du tableau Forme et du tableau permutation
		 * 
		 * @param formes : Tableau contenant les Formes 
		 * @param permutations : Tableau contenant 
		 */
		public Tetrimino(Forme[] formes, int [] permutations)
		{
			this.formes = formes;
			this.permutations = permutations;
		}
		
	

	
	

}
