package fr.iutvalence.java.projet.tetris;

/**
 * @author benmessa
 *
 */
public class Tetrimino
{
	
		/**
		 * 
		 */
		public Forme [] formes;
		
		/**
		 * 
		 */
		public int [] permutations;



		//char [][] Forme = new char[][] {{0,'1','0','0','0'},{'0','1','0','0','0'},{'0','1','0','0','0'},{'0','1','0','0','0'}};
	
		
		/**
		 * @param formes
		 * @param permutations
		 */
		public Tetrimino(Forme[] formes, int [] permutations)
		{
			this.formes = formes;
			this.permutations = permutations;
		}
		
	

	
	

}
