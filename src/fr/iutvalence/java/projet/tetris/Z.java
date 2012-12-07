package fr.iutvalence.java.projet.tetris;

import fr.iutvalence.java.projet.tetris.Tetrimino;
/**
 * @author benmessa
 * 
 */
public class Z extends Tetrimino
{

	
	public final static boolean[][] FORME_0 = new boolean[][] {{true,true,false,false},
															   {false,true,true,false},
															   {false,false,false,false},
															   {false,false,false,false}};
	
	public final static boolean[][] FORME_1 = new boolean[][] {{false,true,false,false},
														       {true,true,false,false},
														       {true,false,false,false},
														       {false,false,false,false}};
	
	public final static boolean[][] FORME_2 = new boolean[][] {{true,true,false,false},
														       {false,true,true,false},
														       {false,false,false,false},
														       {false,false,false,false}};
	
	public final static boolean[][] FORME_3 = new boolean[][] {{false,true,false,false},
														       {true,true,false,false},
														       {true,false,false,false},
														       {false,false,false,false}};
	
	public final static Forme[] FORMES = new Forme[]
			{	
				new Forme(FORME_0),
				new Forme(FORME_1),
				new Forme(FORME_2),
				new Forme(FORME_3),
			};
	/**
	 * 
	 */
	public Z()
	{
		super(FORMES);
	}

}