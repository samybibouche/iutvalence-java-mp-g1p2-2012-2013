package fr.iutvalence.java.projet.tetris;

/**
 * Une classe qui permet de générer les formes de chaque Tetrimino
 * 
 * @author benmessa
 */
public class Forme
{

	// FIXME définir les valeurs par des constantes ou utiliser le type booléen
	// FIXME définir l'attribut en private
	/**
	 * Tableau à deux dimensions d'entiers, les valeurs que peuvent prendre les cases sont 1 ou 0 1 si la case est
	 * rempli et 0 si la case est vide
	 */
	private boolean[][] tab;

	// FIXME (not fixed) compléter le commentaire (indiquer dans quel état est l'objet construit)
	/**
	 * @param tab
	 *            : Un tableau rempli de valeurs 1 et 0 déterminant la forme du Tetrimino
	 */
	public Forme(boolean[][] tab)
	{
		this.tab = tab;
	}


	public String toString()
	{
		String res="";
		
		if (this.tab[0][0])
		{
			res ="F_";
		}
		else
		{
			res=res+"  ";
		}
		
			if (this.tab[0][1])
			{
			res = res + "_ ";
			}
			else
			{
				res=res+"  ";
			}
				
				if (this.tab[0][2])
				{
				res = res + "_ ";
				}
				else
				{
					res=res+"  ";
				}
								
					if(this.tab[0][3])
					{
					res = res +"_\n";
					}
					else
					{
					res = res +"\n";
					}
		
		if (this.tab[1][0])
		{
			res ="|_";
		}
		else
		{
			res=res+"  ";
		}
			
			if (this.tab[1][1])
			{
			res = res + "|_";
			}
			else
			{
				res=res+"  ";
			}
			
					if (this.tab[1][2])
					{
						res = res + "|_";
					}
					else
					{
						res=res+"  ";
					}
						
							if(this.tab[1][3])
							{
							res = res +"|_|\n";
							}
							else
							{
								res = res +"|\n";
							}

		
		if (this.tab[2][0])
		{
			res ="|_";
		}
		else
		{
			res=res+"  ";
		}
			
			if (this.tab[2][1])
			{
			res = res + "|_";
			}
			else
			{
				res=res+"  ";
			}
			
					if (this.tab[2][2])
					{
						res = res + "|_";
					}
					else
					{
						res=res+"  ";
					}
						
							if(this.tab[2][3])
							{
							res = res +"|_|\n";
							}
							else
							{
								res = res +"|\n";
							}
							
		
		if (this.tab[3][0])
		{
			res ="|_";
		}
		else
		{
			res=res+"  ";
		}
			
			if (this.tab[3][1])
			{
			res = res + "|_";
			}
			else
			{
				res=res+"  ";
			}
			
					if (this.tab[3][2])
					{
						res = res + "|_";
					}
					else
					{
						res=res+"  ";
					}
						
							if(this.tab[3][3])
							{
							res = res +"|_|\n";
							}
							else
							{
								res = res +"|\n";
							}
					
		
		

		return res;
			
		
	}
}
