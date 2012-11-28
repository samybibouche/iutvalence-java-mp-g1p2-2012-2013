package fr.iutvalence.java.projet.tetris;

import fr.iutvalence.java.projet.tetris.Tetrimino;

/**
 * @author benmessa
 *
 */
public class TE extends Tetrimino
{
	/**
	 * 
	 */
	String[] t;
	
	/**
	 * 
	 */
	public TE()
	
	{
		super(formes);
		this.t[0] = "TE (1ere forme)";
		this.t[1] = "TE (2eme forme)";
		this.t[2] = "TE (3eme forme)";
		this.t[3] = "TE (4eme forme)";
	}

}
