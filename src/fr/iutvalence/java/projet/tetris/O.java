package fr.iutvalence.java.projet.tetris;
import fr.iutvalence.java.projet.tetris.Tetrimino;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
/**
 * @author benmessa
 * 
 */
public class O extends Tetrimino
{
	

	public final static boolean[][] FORME_0 = new boolean[][] {{true,true,false,false},
															   {true,true,false,false},
															   {false,false,false,false},
															   {false,false,false,false}};
	
	public final static boolean[][] FORME_1 = new boolean[][] {{true,true,false,false},
														       {true,true,false,false},
														       {false,false,false,false},
														       {false,false,false,false}};
	
	public final static boolean[][] FORME_2 = new boolean[][] {{true,true,false,false},
														       {true,true,false,false},
														       {false,false,false,false},
														       {false,false,false,false}};
	
	public final static boolean[][] FORME_3 = new boolean[][] {{true,true,false,false},
														       {true,true,false,false},
														       {false,false,false,false},
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
	public O()
	{
		super(FORMES);
		
	}
	


}