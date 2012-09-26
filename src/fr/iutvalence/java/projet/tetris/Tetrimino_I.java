package fr.iutvalence.java.projet.tetris;

/**
 * @author benmessa
 *   _
 *	|_|
 *  |_|
 *  |_|
 *  |_|
 *  
 *  Chaque case doit être indépendantes
 *  
 */

public class Tetrimino_I
{
	
	/**
	 * Indique si le tetrimino est entier ou non
	 */
	public boolean entier;
	
	
	/**
	 * Creer le Tetrimino O
	 */
	public void GenererTetrimino_I()
	{  
		char[][] t={{'x','x'},{'x','x'},{'x','x'},{'x','x'}};
		t[0][1]= 'y';
		t[1][0]= 'z'; // z : point fixe du tetrimino
		t[1][1]= 'y';
		t[2][1]= 'y'; // y : vide	  
		t[3][1]= 'y';
	}


	
}
