package fr.iutvalence.java.projet.tetris;

/**
 * @author benmessa
 *  
 *  Chaque case doit être indépendantes
 *  
 */

public class Tetrimino_T
{
	
	/**
	 * Indique si le tetrimino est entier ou non
	 */
	public boolean entier;
	
	
	/**
	 * Creer le Tetrimino S
	 */
	public void GenererTetrimino_T()
	{  
		char[][] t={{'x','x'},{'x','x'},{'x','x'}};
		t[0][1]= 'y';
		t[1][0]= 'z'; // z : point fixe du tetrimino
		t[2][1]= 'y'; // y : vide	  
	}


	
}

