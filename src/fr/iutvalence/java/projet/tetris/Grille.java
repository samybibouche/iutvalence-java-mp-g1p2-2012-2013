package fr.iutvalence.java.projet.tetris;

import fr.iutvalence.java.projet.tetris.*;


/**
 * Une Grille (Terrain de Jeu) de 21x10 Carreaux
 * 
 * Cette classe gére toutes les modifications apportés à la grille c'est-a-dire, 
 * les déplacements de chaque Tetriminos ainsi que l'eliminations des lignes complétes
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

	/**
	 * Le tableau qui va gerer le terrain de jeu, la grille
	 * chaque element correspond à une case.
	 * 
	 * Exemple : terrain[0][0] correspond a la premiere case de la premiere ligne
	 * de la premiere colonne 
	 */
	public String[][] terrain;
	
	/**
	 * La variable qui va définir sur quelle colonne ce situe la premiere case du Tetrimino
	 * 
	 * Exemple : 
	 * 
	 *    
	 *  pos_x
	 *    |
	 *    v
	 *   __ __ __ __
	 *  |_.|__|__|__|
	 *  |__|__|__|__|
	 *  |__|__|__|__|
	 *  |__|__|__|__|
	 * 
	 * Cette variable est initialement égale à 0 sur la grille.
	 * 
	 */
	public int pos_x;
	
	/**
	 * 	 * La variable qui va définir sur quelle ligne ce situe la premiere case du Tetrimino
	 * 
	 * Exemple : 
	 * 
	 *    
	 *  			 __ __ __ __
	 *  pos_y --->	|._|__|__|__|
	 *  			|__|__|__|__|
	 *  			|__|__|__|__|
	 *  			|__|__|__|__|
	 * 
	 * Cette variable est initialement égale à 4 sur la grille.
	 * 
	 */
	public int pos_y;
	
	/**
	 * Un boolean qui indique l'etat de la piece c'est a dire, si elle est ou non tombée.
	 * 
	 * Si elle est tombé, on ne la "touche" plus.
	 * On initialise pos_x à 0 (sur la premiere ligne)
	 * On initialise pos_y à 4 (sur la premiere colonne)
	 * 
	 * Ensuite si toutes ces conditions sont réunis, on instancie une nouvelle pièce.
	 */
	public boolean etatPiece;

	/**
	 * Constructeur pour créer la Grille
	 * 
	 * @param terrain: Le tableau qui va gerer le terrain de jeu, la grille
	 * 
	 */
	public Grille(String[][] terrain)
	{
		this.terrain = terrain;
		this.etatPiece = false;
	}

	
	/**
	 * @param : Un Tetrimino à afficher sur la grille
	 * 
	 * Cette methode "récupere" le tableau de forme du tetrimino entré en parametres, (et créer
	 * dans la classe qui correspond ->  I,O,S,Z,L,J,T) ensuite elle retranscrit les valeurs
	 * dans la grille
	 */
	public void nouveauTetrimino(Tetrimino T)
	{
		Forme F;
		
		
		this.pos_x=4;
		this.pos_y=0;
		
		int VarX=pos_x;
		int VarY=pos_y;
		
		F = T.formes[0];

		for (int y=0; y<4; y++)
		{
			for (int x=0; x<4; x++)
			{
				if(F.tab[y][x])
				{
					this.terrain[VarY][VarX]="X";
				}								
				VarX ++;				
			}
			
			VarX=this.pos_x;
			VarY++;
			
		}
	}
	
	
		
	/**
	 * @param : Un Tetrimino à retourner, 2 entiers (la position x et y du Tetrimino)
	 * 
	 * Dans cette methode on efface le Tetrimino en train de tomber, ensuite on récupere la 
	 * tableau de la forme suivante grâce à la méthode rotation qui incrémente l'attribut
	 * formecourante.
	 * 
	 */
	public void retournerTetrimino(Tetrimino T, int px, int py)
	{
		String c="V";
		Forme F;
		
		
		int VarX=px;
		int VarY=py;
		
		if (Tetrimino.formecourante<4)
		{
		T.rotation();
		}
		if (Tetrimino.formecourante==4)
		{
		Tetrimino.formecourante=0;	
		}
		
		F = T.formes[Tetrimino.formecourante];
		
		for (int y=py; y<py+4; y++)
		{
			for (int x=px; x<px+4; x++)
			{
				this.terrain[y][x]=".";	
			}
		}

		for (int y=0; y<4; y++)
		{
			for (int x=0; x<4; x++)
			{
				if(F.tab[y][x])
				{
					this.terrain[VarY][VarX]="X";
				}								
				VarX ++;				
			}
			
			VarX=px;
			VarY++;
			
		}
	
	
}
		
		

	
	/**
	 * Cette méthode permet de vérifier pour une ligne donnée si le deplacement vertical du Tetrimino
	 * possible, il suffit de regarder si sur la ligne qui suit le Tetrimino il y a au moins un "X".
	 * Si il y a au moins un "X" alors il est impossible de faire tomber la piece.
	 * 
	 * @param a : Un entier qui correspond à la ligne vérifier
	 * @return : Un bouléen qui retourne vrai si le deplacement vertical est possible
	 * faux sinon
	 */
	public boolean tomberPossible(int a)
	{
		for (int x=this.pos_x; x<this.pos_x+4; x++)
		{
			if (this.terrain[a][x] == "X")
			{
				return false;
			}			
		}		 
		
		return true;
		
	}
	
	/**
	 * Une méthode qui retourne l'etat de la piece
	 */
	public boolean getEtatPiece()
	{
		return this.etatPiece;
	}
	
	
	/**
	 * Une méthode pour attribuer une valeur l'attribut etatPiece
	 */
	public boolean setEtatPiece(boolean b)
	{
		this.etatPiece = b;
		return this.etatPiece;
	}
	
	/**
	 * Une méthode pour retourner la position x du Tetrimino
	 * 
	 * @ return : Un entier la valeur pos_x
	 */
	public int getPosX()
	{
		return this.pos_x;
	}
	
	/**
	 * Une méthode pour retourner la position y du Tetrimino
	 * 
	 * @ return : Un entier la valeur pos_y
	 */
	public int getPosY()
	{
		return this.pos_y;
	}
	

	/**
	 * Cette méthode permet de faire descendre le Tetrimino d'un cran
	 * Il est important de traiter tout les cas pour la descente soit fonctionelle.
	 * 
	 */
	public void tomberTetrimino()
	{
		for (int x=pos_x;x<pos_x+4;x++)
		{
			
			
			
			if (this.pos_y<17)
			{
				if(tomberPossible(this.pos_y+4))
				{
				this.terrain[this.pos_y+4][x] = this.terrain[this.pos_y+3][x];
				this.terrain[this.pos_y+3][x] = this.terrain[this.pos_y+2][x];
				this.terrain[this.pos_y+2][x] = this.terrain[this.pos_y+1][x];
				this.terrain[this.pos_y+1][x] = this.terrain[this.pos_y][x];
				this.terrain[this.pos_y][x] = "." ;
				}
			}
			
			if (this.pos_y>=17)
			{
				for(int S=20; S>5; S--)
				{
				
				if (tomberPossible(S))
				{
					for (int e=pos_x;e<pos_x+4;e++)
					{
						this.terrain[S][e] = this.terrain[S-1][e];
						this.terrain[S-1][e] = this.terrain[S-2][e];
						this.terrain[S-2][e] = this.terrain[S-3][e];
						this.terrain[S-3][e] = this.terrain[S-4][e];
					}
					
					this.pos_y ++;
				}
				
				}
				
				
				if (!tomberPossible(20))
				{
					this.etatPiece=true;
					this.pos_y=0;
					this.pos_x=4;
				}

			}
			
			

			

			
		}
		
		
		this.pos_y ++;
		
	}
	
	
	/**
	 * Cette méthode permet de vérifier pour une colonne donnée si le deplacement à droite du Tetrimino
	 * est possible, il suffit de regarder si sur la colonne qui suit le Tetrimino il y a au moins un "X".
	 * Si il y a au moins un "X" alors il est impossible de décaler la piece à droite.
	 * 
	 * @param a : Un entier qui correspond à la colonne vérifier
	 * @return : Un bouléen qui retourne vrai si le deplacement horizontal est possible
	 * faux sinon
	 */
	public boolean droitePossible(int a)
	{
		for (int y=this.pos_y; y<this.pos_y+4; y++)
		{
			if (this.terrain[y][a] == "X")
			{
				return false;
			}			
		}		 
		
		return true;
	}
	
	/**
	 * Cette méthode permet de décaler le Tetrimino a gauche
	 * Il est important de traiter tout les cas pour la descente soit fonctionelle.
	 */
	public void gaucheTetrimino()
	{



		if ((this.pos_x>0) || (this.pos_x<6))
		{
			
			for (int y=pos_y;y<pos_y+4;y++)
			{
			this.terrain[y][this.pos_x-1] = this.terrain[y][this.pos_x];
			this.terrain[y][this.pos_x] = this.terrain[y][this.pos_x+1];
			this.terrain[y][this.pos_x+1] = this.terrain[y][this.pos_x+2];
			this.terrain[y][this.pos_x+2] = this.terrain[y][this.pos_x+3];
			this.terrain[y][this.pos_x+3] = this.terrain[y][this.pos_x+4] ;
			}
			this.pos_x--;
		}
		
		if (this.pos_x==6)
		{
			
			for (int y=pos_y;y<pos_y+4;y++)
			{
			this.terrain[y][this.pos_x-1] = this.terrain[y][this.pos_x];
			this.terrain[y][this.pos_x] = this.terrain[y][this.pos_x+1];
			this.terrain[y][this.pos_x+1] = this.terrain[y][this.pos_x+2];
			this.terrain[y][this.pos_x+2] = this.terrain[y][this.pos_x+3];
			this.terrain[y][this.pos_x+3] = ".";
			}
			this.pos_x--;
		}
		
		if (this.pos_x==7)
		{
			
			for (int y=pos_y;y<pos_y+4;y++)
			{
			this.terrain[y][this.pos_x-1] = this.terrain[y][this.pos_x];
			this.terrain[y][this.pos_x] = this.terrain[y][this.pos_x+1];
			this.terrain[y][this.pos_x+1] = this.terrain[y][this.pos_x+2];
			this.terrain[y][this.pos_x+2] = ".";
			}
			this.pos_x--;
		}
		
		if (this.pos_x==8)
		{
			
			for (int y=pos_y;y<pos_y+4;y++)
			{
			this.terrain[y][this.pos_x-1] = this.terrain[y][this.pos_x];
			this.terrain[y][this.pos_x] = this.terrain[y][this.pos_x+1];
			this.terrain[y][this.pos_x+1] = ".";
			}
			this.pos_x--;
		}
		
		
		
	}
	
	/**
	 * Cette méthode permet de décaler le Tetrmino a droite
	 * Il est important de traiter tout les cas pour la descente soit fonctionelle.
	 */
	public void droiteTetrimino()
	{

			if (this.pos_x==0)
			{
				for (int y=pos_y;y<pos_y+4;y++)
				{
				this.terrain[y][this.pos_x+4] = this.terrain[y][this.pos_x+3];
				this.terrain[y][this.pos_x+3] = this.terrain[y][this.pos_x+2];
				this.terrain[y][this.pos_x+2] = this.terrain[y][this.pos_x+1];
				this.terrain[y][this.pos_x+1] = this.terrain[y][this.pos_x];
				this.terrain[y][this.pos_x] = ".";
				}
				this.pos_x++;
			}
			
			if ((this.pos_x<6) || (this.pos_x>0))
			{
				for (int y=pos_y;y<pos_y+4;y++)
				{
				this.terrain[y][this.pos_x+4] = this.terrain[y][this.pos_x+3];
				this.terrain[y][this.pos_x+3] = this.terrain[y][this.pos_x+2];
				this.terrain[y][this.pos_x+2] = this.terrain[y][this.pos_x+1];
				this.terrain[y][this.pos_x+1] = this.terrain[y][this.pos_x];
				this.terrain[y][this.pos_x] = this.terrain[y][this.pos_x-1];
				}
				this.pos_x++;
			}

			
			if (this.pos_x==6)
			{
				if (droitePossible(9))
				{

					for (int e=pos_y;e<=pos_y+4;e++)
					{
					this.terrain[e][9] = this.terrain[e][8];
					this.terrain[e][8] = this.terrain[e][7];
					this.terrain[e][7] = this.terrain[e][6];
					this.terrain[e][6] = ".";
					}
					
					this.pos_x++;
			
				}
				else
				{
					if (droitePossible(8))
					{

						for (int e=pos_y;e<=pos_y+4;e++)
						{
						this.terrain[e][8] = this.terrain[e][7];
						this.terrain[e][7] = this.terrain[e][6];
						this.terrain[e][6] = ".";
						}
						
						
						this.pos_x++;
				
					}
					
					if (droitePossible(7))
					{

						for (int e=pos_y;e<=pos_y+4;e++)
						{
						this.terrain[e][7] = this.terrain[e][6];
						this.terrain[e][6] = ".";
						}
						
						
						this.pos_x++;
				
					}
				 }
				
			}
			
				
			
			if (this.pos_x==7)
			{
				if (droitePossible(9))
				{

					for (int e=pos_y;e<=pos_y+4;e++)
					{
					this.terrain[e][9] = this.terrain[e][8];
					this.terrain[e][8] = this.terrain[e][7];
					this.terrain[e][7] = this.terrain[e][6];
					this.terrain[e][6] = ".";
					}
					
					this.pos_x++;
			
				}
				else
				{
					if (droitePossible(8))
					{

						for (int e=pos_y;e<=pos_y+4;e++)
						{
						this.terrain[e][8] = this.terrain[e][7];
						this.terrain[e][7] = this.terrain[e][6];
						this.terrain[e][6] = ".";
						}
						
						
						this.pos_x++;
				
					}
					
					if (droitePossible(7))
					{

						for (int e=pos_y;e<=pos_y+4;e++)
						{
						this.terrain[e][7] = this.terrain[e][6];
						this.terrain[e][6] = ".";
						}
						
						
						this.pos_x++;
				
					}
				}
					
			}
		
	}
	
	
	

	/**
	 * Génération d'une représentation en ascii-art de la grille
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{

		String res ="\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ___ ___ ___ ___ ___ ___ ___ ___ ___ ___\n";
		String c;

		int h; // Variable locale
		int l; // Variable locale

		h = 0;
		
		while (h != HAUTEUR_MAX)
		{
			l=0;
			while (l != LARGEUR_MAX)
			{
				c = this.terrain[h][l];
				
			res = res +"| "+c+" "; 
			l=l+1;
			}
			
			res = res + "|\n";
		
		h = h + 1;
		}
		
	

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
				if (this.terrain[h][l]==".")
				{
				return false;
				}
				
				l=l+1;				
			}
			
			return true;		
			
	}
	
	
	
	
	/**
	 * Une methode qui retourne vrai si la ligne doit etre éliminer(si elle est complète), faux sinon.
	 * 
	 * @ return : Un boolean : Vrai si la ligne doit etre éliminer, faux sinon
	 */
	
	
	public boolean eliminerLigne()
	{		
		int h=0;
		
		boolean full=false;
		
		while (h<HAUTEUR_MAX)
		{			
			boolean plein;	
			plein = getEtatLigne(h);
			
			if (plein)
			{								
				int l;
				
				// On vide la ligne.
				for (l=0;l<LARGEUR_MAX;l++)
				{
					this.terrain[h][l]=".";			
				}
			
			full = true;
			plein = false;
			}
				
			h=h+1;
		}
		
		if (full)
		{
			return true;	
		}
		else
		{
			return false;
		}
		
			
	}
	
	
	/**
	 * Methode pour arranger la grille : une fois qu'une on plusieurs lignes sont complètes, on les vides 
	 * et on arrange la grille
	 * 
	 */
	public void arrangerGrille()
	{
		
		boolean arrange = eliminerLigne();
		
		int h = HAUTEUR_MAX-1;
		int l;
		int x;
		int i = HAUTEUR_MAX-1;
		
		while (h >= 0)
		{
			x = 0;
			l = 0;
			while (l<LARGEUR_MAX)
			{
				if (this.terrain[h][l] != ".")
				{
					x = x + 1;
				}
				l = l + 1;
			}
			if (x != 0)
			{
				l = 0;
				if (i != h)
				{
					while (l < LARGEUR_MAX)
					{
						this.terrain[i][l] = this.terrain[h][l];
						l = l+1;
					}
					i = i - 1;
				}
				else 
				{
					i = i -1;
				}
			}
			
		h = h - 1;
		}
		
		while (i >= 0)
		{
			l = 0;
			while (l < LARGEUR_MAX)
			{
				this.terrain[i][l] = ".";
				l = l + 1;
			}
			i = i - 1;
		}
	}
		



}



	
	
	

