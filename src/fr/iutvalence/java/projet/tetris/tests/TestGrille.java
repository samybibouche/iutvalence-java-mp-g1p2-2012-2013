package fr.iutvalence.java.projet.tetris.tests;

import fr.iutvalence.java.projet.tetris.Grille;

// FIXME (FIXED) compléter le commentaire (dire ce que l'on veut tester et comment)
/**
 * @author benmessa
 * 
 * Ce qu'on veut ?
 * 
 * Dans ce test, on veut tester l'affichage de la grille qui sert dans notre tetris
 * de terrain de jeu. Cette grille est de hauteur 22 et de la largeur 10 (en realité
 * la hauteur de la grille est de 20 mais on ajoute volontairement 2 lignes pour pouvoir
 * bloqué les tetrminos en bas une fois qu'ils ont terminé leurs descentes et pour pouvoir
 * déclencher un game over quand l'insertion d'un tetrimino est impossible dans la grille).
 * 
 * Comment ?
 * 
 * On créer une grille vierge dans un premier temps, on effectue ensuite une instanciation
 * de cette grille. Enfin, on affiche le resultat.
 * 
 */
public class TestGrille
{

	/**
	 * point d'entrée de l'application
	 * 
	 * @param args
	 *            Aucun
	 */
	public static void main(String[] args)
	{
		int[][] grille =
			{
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }				
			};

		Grille g = new Grille(grille);

		System.out.println(g);
	}

}
