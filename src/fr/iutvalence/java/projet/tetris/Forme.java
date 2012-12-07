package fr.iutvalence.java.projet.tetris;


/**
 * Une classe qui permet de gÃ©nÃ©rer les formes de chaque Tetrimino
 * 
 * @author benmessa
 */
public class Forme
{

	/**
	 * Tableau Ã  deux dimensions d'entiers, les valeurs que peuvent prendre les cases sont 1 ou 0 1 si la case est
	 * rempli et 0 si la case est vide
	 */
	public boolean[][] tab;

	/**
	 * @param tab
	 *            : Un tableau rempli de valeurs 1 et 0 determinant la forme du Tetrimino
	 */
	public Forme(boolean[][] tab)
	{
		this.tab = tab;
	}


	/**
	 * La methode toString : Affichage en ascii art d'un Tetrimino
	 */
	public String toString()
	{
		String res="";
			
	if (this.tab[0][0])
	{
		res =" __ ";
	}
	else
	{
		res=res+"    ";
	}
	
		if (this.tab[0][1])
		{
		res = res + "__ ";
	}
	else
	{
		res=res+"   ";
	}
	
		if (this.tab[0][2])
		{
		res = res + "__ ";
	}
	else
	{
		res=res+"   ";
	}
					
		if(this.tab[0][3])
		{
		res = res +"__\n";
	}
	else
	{
	res = res +"\n";
	}
	
	if (this.tab[0][0])
	{
		res =res +"|__";
	}
	else
	{
		if(this.tab[1][0])
		{
			res=res+" __";
		}
		else
		{
			res=res+"   ";
		}
	}
	
		
	if (this.tab[0][1])
	{
	res = res + "|__";
	}
	else
	{
		if(this.tab[1][1])
		{
			if(this.tab[0][0])
			{
			res=res+"|__";
			}
			else
			{
			res=res+" __";
			}
		
	}
	else
	{
		if(this.tab[0][0])
		{
		res=res+"|  ";
	}
	else
	{
	res=res+"   ";
			}
		}
		
	}
	
	if (this.tab[0][2])
	{
	res = res + "|__";
	}
	else
	{
		if(this.tab[1][2])
		{
			if(this.tab[0][1])
			{
			res=res+"|__";
	}
	else
	{
	res=res+" __";
		}
		
	}
	else
	{
		if(this.tab[0][1])
		{
		res=res+"|  ";
	}
	else
	{
	res=res+"   ";
			}
		}
		
	}
	
	if (this.tab[0][3])
	{
	res = res + "|__|\n";
	}
	else
	{
		if(this.tab[1][3])
		{
			if(this.tab[0][2])
			{
			res=res+"|__\n";
	}
	else
	{
	res=res+" __\n";
		}
		
	}
	else
	{
		if(this.tab[0][2])
		{
		res=res+"|  \n";
	}
	else
	{
	res=res+"   \n";
			}
		}
		
	}
	
	if (this.tab[1][0])
	{
		res =res +"|__";
	}
	else
	{
		if(this.tab[2][0])
		{
			res=res+" __";
	}
	else
	{
		res=res+"   ";
		}
	}
	
		
	if (this.tab[1][1])
	{
	res = res + "|__";
	}
	else
	{
		if(this.tab[2][1])
		{
			if(this.tab[1][0])
			{
			res=res+"|__";
	}
	else
	{
	res=res+"__ ";
		}
		
	}
	else
	{
		if(this.tab[1][0])
		{
		res=res+"|  ";
	}
	else
	{
	res=res+"   ";
			}
		}
		
	}
	
	if (this.tab[1][2])
	{
	res = res + "|__";
	}
	else
	{
		if(this.tab[2][2])
		{
			if(this.tab[1][1])
			{
			res=res+"|__";
	}
	else
	{
	res=res+"__ ";
		}
		
	}
	else
	{
		if(this.tab[1][1])
		{
		res=res+"|  ";
	}
	else
	{
	res=res+"   ";
			}
		}
		
	}
	
	if (this.tab[1][3])
	{
	res = res + "|__|\n";
	}
	else
	{
		if(this.tab[2][3])
		{
			if(this.tab[1][2])
			{
			res=res+"|__\n";
	}
	else
	{
	res=res+"__ \n";
		}
		
	}
	else
	{
		if(this.tab[1][2])
		{
		res=res+"|  \n";
	}
	else
	{
	res=res+"   \n";
			}
		}
		
	}
	
	if (this.tab[2][0])
	{
		res =res +"|__";
	}
	else
	{
		if(this.tab[3][0])
		{
			res=res+"__ ";
	}
	else
	{
		res=res+"   ";
		}
	}
	
		
	if (this.tab[2][1])
	{
	res = res + "|__";
	}
	else
	{
		if(this.tab[3][1])
		{
			if(this.tab[2][0])
			{
			res=res+"|__";
	}
	else
	{
	res=res+"__ ";
		}
		
	}
	else
	{
		if(this.tab[2][0])
		{
		res=res+"|  ";
	}
	else
	{
	res=res+"   ";
			}
		}
		
	}
	
	if (this.tab[2][2])
	{
	res = res + "|__";
	}
	else
	{
		if(this.tab[3][2])
		{
			if(this.tab[2][1])
			{
			res=res+"|__";
	}
	else
	{
	res=res+"__ ";
		}
		
	}
	else
	{
		if(this.tab[2][1])
		{
		res=res+"|  ";
	}
	else
	{
	res=res+"   ";
			}
		}
		
	}
	
	if (this.tab[2][3])
	{
	res = res + "|__|\n";
	}
	else
	{
		if(this.tab[3][3])
		{
			if(this.tab[2][2])
			{
			res=res+"|__\n";
	}
	else
	{
	res=res+"__ \n";
		}
		
	}
	else
	{
		if(this.tab[2][2])
		{
		res=res+"|  \n";
	}
	else
	{
	res=res+"   \n";
			}
		}
		
	}
	
	if (this.tab[3][0])
	{
		res =res +"|__";
	}
	else
	{
		res=res+"   ";
	}
	
		
	if (this.tab[3][1])
	{
	res = res + "|__";
	}
	else
	{
		if(this.tab[3][0])
		{
		res=res+"|  ";
	}
	else
	{
	res=res+"   ";
		}
	}
	
	if (this.tab[3][2])
	{
	res = res + "|__";
	}
	else
	{
		if(this.tab[3][1])
		{
		res=res+"|  ";
	}
	else
	{
	res=res+"   ";
		}
	}
	
	if (this.tab[3][3])
	{
	res = res + "|__|\n";
	}
	else
	{
		if(this.tab[3][2])
		{
		res=res+"|  \n";
	}
	else
	{
	res=res+"   \n";
		}
	}
	



		return res;
			
		
	}
}