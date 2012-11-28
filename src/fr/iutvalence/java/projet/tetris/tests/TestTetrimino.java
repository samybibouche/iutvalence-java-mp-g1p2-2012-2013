package fr.iutvalence.java.projet.tetris.tests;
import fr.iutvalence.java.projet.tetris.*;
import fr.iutvalence.java.projet.tetris.Carre;
import fr.iutvalence.java.projet.tetris.Barre;
import fr.iutvalence.java.projet.tetris.TE;
/*import fr.iutvalence.java.projet.tetris.Tetrimino.Carre;
import fr.iutvalence.java.projet.tetris.Tetrimino.Carre;
import fr.iutvalence.java.projet.tetris.Tetrimino.Carre;
import fr.iutvalence.java.projet.tetris.Tetrimino.Carre;*/

/**
 * @author benmessa
 *
 */
public class TestTetrimino
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Carre toto = new Carre();
		System.out.println(toto);
		toto.rotation();
		System.out.println(toto);
		Barre b = new Barre();
		System.out.println(b);
		b.rotation();
		System.out.println(b);
		b.rotation();
		System.out.println(b);
		TE t = new TE();
		System.out.println(t);
		t.rotation();
		System.out.println(t);
		t.rotation();
		System.out.println(t);
		t.rotation();
		System.out.println(t);
		t.rotation();
		System.out.println(t);

	}

}
