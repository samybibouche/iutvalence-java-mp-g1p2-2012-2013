package fr.iutvalence.java.projet.tetris;

/**
 * @author benmessa
 *  _
 * |_|
 * |_|_
 * |_|_|
 * 
 *  Chaque case doit être indépendantes
 *  
 */

public class Tetrimino_L
{
	
	/**
	 * Indique si le tetrimino est entier ou non
	 */
	public boolean entier;
	
	
	/**
	 * Creer le Tetrimino L
	 */
	public void GenererTetrimino_L()
	{  
		char[][] t={{'x','x'},{'x','x'},{'x','x'}};
		t[1][0]= 'y';
		t[1][1]= 'z'; // z : point fixe du tetrimino
		t[2][0]= 'y'; // y : vide	  
	}


	
}

