package fr.iutvalence.java.projet.tetris;
/**
 * Une Classe permettant de de gerer les Tetriminos en determinant une forme, en effectuant une rotation
 * 
 * @author benmessa
 * 
 */
public class Tetrimino
{
	
	/**
	 * L'entier qui gére la formes courante du tableau
	 */
	public static int formecourante ;
	

	/**
	 * Tableau Forme contenant les 19 formes de Tetrimino possible
	 * 
	 */
	public static Forme[] formes;

	
	public int getFormeCourante()
	{
		return this.formecourante;
	}
	
	/**
	 *
	 */
	public int initFormeCourante()
	{
		this.formecourante=0;
		return this.formecourante;
	}
	
	

	/**
	 * Construit un Tetrimino Ã  partir du tableau Forme et de la formescourantes initialement à 0
	 * 
	 * @param formes
	 *            : Tableau contenant les Formes
	 */
	public Tetrimino(Forme[] formes) 
	{
		this.formes = formes;
		this.formecourante = 0;
	}
	
	/**
	 * La methode qui choisi la forme suivante d'une Tetrimino, il suffit d'incrementer formecourante.
	 */
	public void rotation()
	{
		formecourante = (formecourante+1) % formes.length;
	}
	
	public String toString()
	{
		return this.formes[formecourante].toString();
	}
	
	


}
