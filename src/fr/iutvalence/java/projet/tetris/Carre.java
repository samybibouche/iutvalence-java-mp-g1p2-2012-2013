package fr.iutvalence.java.projet.tetris;
import fr.iutvalence.java.projet.tetris.Tetrimino;

/**
 * @author benmessa
 *
 */
public class Carre extends Tetrimino
{
	/**
	 * 
	 */
	String[] C;
	
	/**
	 * 
	 */
	public Carre()
	{
		super(formes);
		this.C[0] = "Carre (seul forme)";
	}

}
