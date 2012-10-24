package fr.iutvalence.java.projet.tetris;

/**
 * 
 * 
 * Une Grille (Terrain de Jeu) de 21x10 Carreaux
 * 
 * Remarque : on utilisera 21 Carreaux de Hauteur pour provoquer un "Game Over"
 * 
 * @author benmessa
 */

public class Grille
{
	/**
	 * Une constante qui définit la largeur maximum supportée par notre grille
	 */
	public final static int LARGEUR_MAX = 10;

	/**
	 * Une constante qui définit la hauteur maximum supportée par notre grille
	 */
	public final static int HAUTEUR_MAX = 21;

	// FIXME (FIXED) définir cet attribut en private
	/**
	 * Le tableau qui va gerer le terrain de jeu, la grille
	 */
	private int[][] terrain;

	//@formatter:off
	/*
	 *  _ _ _ _ _ _ _ _ _ _ 
	 * |\|\|\|\|\|\|\|\|\|\|21 
	 * |_|_|_|_|1|_|_|_|_|_|20 
	 * |_|_|_|_|1|1|_|_|_|_|19
	 * |_|_|_|_|_|1|_|_|_|_|18 
	 * |_|_|_|_|_|_|_|_|_|_|17 
	 * |_|_|_|_|_|_|_|_|_|_|16 
	 * |_|_|_|_|_|_|_|_|_|_|15
	 * |_|_|_|_|_|_|_|_|_|_|14 
	 * |_|_|_|_|_|_|_|_|_|_|13 
	 * |_|_|_|_|_|_|_|_|_|_|12 
	 * |_|_|_|_|_|_|_|_|_|_|11
	 * |_|_|_|_|_|_|_|_|_|_|10 
	 * |_|_|_|_|_|_|_|_|_|_|9 
	 * |_|_|_|_|_|_|_|_|_|_|8 
	 * |_|_|_|_|_|_|_|_|_|_|7
	 * |_|_|_|_|_|_|_|_|_|_|6 
	 * |_|_|_|_|_|_|_|_|_|_|5 
	 * |_|_|_|_|_|_|_|_|_|_|4 
	 * |1|_|_|_|_|1|_|_|_|1|3
	 * |1|_|_|_|1|1|1|_|_|1|2 
	 * |1|1|_|1|1|1|1|_|1|1|1 
	 * |\|\|\|\|\|\|\|\|\|\|0
	 *  0 1 2 3 4 5 6 7 8 9
	 *
	 */
	//@formatter:off

	
	
	
	
	
	// FIXME cela n'a pas vraiment de sens de créer une grille déjà remplie 
	// FIXME compléter le commentaire
	/**
	 * Constructeur pour créer la Grille
	 * 
	 * @param terrain
	 *            : Le tableau qui va gerer le terrain de jeu, la grille
	 * 
	 */
	public Grille(int[][] terrain)
	{
		this.terrain = terrain;
	}

	

	// FIXME (FIXED) compléter le commentaire (dire à quoi ressemble la chaine retournée, en montrant un exemple)
	/**
	 * Methode pour afficher la grille de jeu
	 * Hauteur de grille  :  22   /    Largeur  :  10
	 * Elle retourne  22  lignes de  10  |__|  
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		// TODO Auto-generated method stub

		String res =" ___ ___ ___ ___ ___ ___ ___ ___ ___ ___\n";

		int h; // Variable locale
		int l; // Variable locale

		h = 0;
		
		while (h != HAUTEUR_MAX)
		{
			l=0;
			while (l != LARGEUR_MAX)
			{
			res = res +"|_"+this.terrain[h][l]+"_"; 
			l=l+1;
			}
			
			res = res + "|\n";
		
		h = h + 1;
		}

		// FIXME (FIXED) surtout pas ! la chaine retournée serait simplement remplacée par celle générée par Object#toString() 

		return res;
	}
	
	
	/**
	 * Une methode pour déterminer l'etat d'une Ligne, c'est a dire indiqué si
	 * la ligne donnée en paramètre est compléte ou non
	 * 
	 * 
	 * @param h : la ligne a examiner
	 * @return : un booléen vrai si la ligne est complète faux sinon
	 */
	public boolean getEtatLigne(int h)
	{
				
			int l = 0;
			
			while (l != 10)
			{
				if (this.terrain[h][l]==0)
				{
				return false;
				}
				
				l=l+1;				
			}
			
			return true;		

			
		
	}

}
