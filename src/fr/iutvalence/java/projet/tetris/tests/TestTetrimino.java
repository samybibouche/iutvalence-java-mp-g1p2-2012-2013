package fr.iutvalence.java.projet.tetris.tests;
import fr.iutvalence.java.projet.tetris.Tetrimino;
import fr.iutvalence.java.projet.tetris.Carre;
import fr.iutvalence.java.projet.tetris.Barre;
import fr.iutvalence.java.projet.tetris.TE;
/*import fr.iutvalence.java.projet.tetris.Tetrimino.Carre;
import fr.iutvalence.java.projet.tetris.Tetrimino.Carre;
import fr.iutvalence.java.projet.tetris.Tetrimino.Carre;
import fr.iutvalence.java.projet.tetris.Tetrimino.Carre;*/

public class TestTetrimino
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Carre c = new Carre();
		System.out.println(c);
		c.rotation();
		System.out.println(c);
		Barre b = new Barre();
		System.out.println(b);
		b.rotation();
		System.out.println(b);
		b.rotation();
		System.out.println(b);
		Te t = new Te();
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
