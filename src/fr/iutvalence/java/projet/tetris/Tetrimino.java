package fr.iutvalence.java.projet.tetris;
/**
 * Une Classe permettant de gérer les Tetriminos ainsi que leurs permutations
 * 
 * @author benmessa
 * 
 */
public class Tetrimino
{
	
	// type ?
	//class CARRE {forme C;};
	//class BARRE {forme B;};
	//class TE {forme T;};
	//class ZE {forme Z;};
	//class LE {forme L;};
	//class SE {forme S;};
	//class JE {forme J;};

	
	// forme courante ?
	private int formecourante ;
	
	// FIXME corriger le commentaire
	/**
	 * Tableau Forme contenant les 19 formes de Tetrimino possible
	 * 
	 */
	private Forme[] formes;

	// char [][] Forme = new char[][]
	// {{0,'1','0','0','0'},{'0','1','0','0','0'},{'0','1','0','0','0'},{'0','1','0','0','0'}};

	/**
	 * Construit un Tetrimino à partir du tableau Forme et du tableau permutation
	 * 
	 * @param formes
	 *            : Tableau contenant les Formes
	 * @param permutations
	 *            : Tableau contenant
	 */
	public Tetrimino(Forme[] formes) // Ajouter un parametre TypeT
	{
		this.formes = formes;
		this.formecourante = 0;
	}

	// FIXME redéfinir toString

	// FIXME ajouter des méthodes pour faire tourner le tétrimino, obtenir la forme courante
	
	public void rotation()
	{
		this.formecourante = (this.formecourante+1) % formes.length;
	}
	
	public String toString()
	{
		return this.formes[formecourante];
	}

	/*
	public class Carre{
		String[] C; 	
	{
		this.C[0] = "Carre (seul forme)";			
	}
	}
	

	public class Barre{
		String[] B; 	
	{
		this.B[0] = "Barre (1ere forme)";
		this.B[1] = "Barre (2eme forme)";
	}
	}
	
	public class Se{
		String[] S; 	
	{
		this.S[0] = "SE (1ere forme)";
		this.S[1] = "SE (2eme forme)";
	}
	}
	
	public class Ze{
		String[] Z; 	
	{
		this.Z[0] = "ZE (1ere forme)";
		this.Z[1] = "ZE (2eme forme)";
	}
	}
	
	public class Te{
		String[] T; 	
	{
		this.T[0] = "TE (1ere forme)";
		this.T[1] = "TE (2eme forme)";
		this.T[2] = "TE (3eme forme)";
		this.T[3] = "TE (4eme forme)";
	}
	}
	
	public class Le{
		String[] L; 	
	{
		this.L[0] = "LE (1ere forme)";
		this.L[1] = "LE (2eme forme)";
		this.L[2] = "LE (3eme forme)";
		this.L[3] = "LE (4eme forme)";
	}
	}
	
	public class Je{
		String[] J; 	
	{
		this.J[0] = "JE (1ere forme)";
		this.J[1] = "JE (2eme forme)";
		this.J[2] = "JE (3eme forme)";
		this.J[3] = "JE (4eme forme)";
	}
	}*/
}
