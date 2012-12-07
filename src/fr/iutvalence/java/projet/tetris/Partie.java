package fr.iutvalence.java.projet.tetris;

import java.awt.event.KeyEvent;
import fr.iutvalence.java.projet.tetris.*;


/**
 * Indique l'etat de la partie
 * 
 * @author benmessa
 * 
 */
public class Partie
{

	/**
	 * Indique si la partie est en cours ou est terminée
	 */
	private boolean etatPartie;
	
	
	/**
	 * Une méthode pour générer un Tetrimino aléatoirement sous sa premiere forme (cf. classe Forme)
	 * 
	 * @return : un Tetrimino aléatoire
	 */
	public static Tetrimino randomTetrimino()
	{

	int lower = 1;
	int higher = 7;
	
	int random = (int)(Math.random() * (higher-lower)) + lower;
	
	switch (random)	{
		case 1: 
		O Forme_C = new O();
		return Forme_C;
		
		case 2: 
		T Forme_T = new T(); 
		return Forme_T;
			
		case 3: 
		L Forme_L = new L(); 
		return Forme_L;
			
		case 4: 
		J Forme_J = new J(); 
		return Forme_J;
		
		case 5: 
		I Forme_I = new I();
		return Forme_I;
		
		case 6: 
		S Forme_S = new S();
		return Forme_S;
		
		case 7: 
		Z Forme_Z = new Z();
		return Forme_Z;
	}
	
	return null;	
	
	}
	
	
	/**
	 * Initialise le boolean etatPartie à vrai, provoque de le debut de la partie
	 */
	public void demarrerPartie()
	{
		this.etatPartie=true;

	}
	
	/**
	 * @return : etatPartie : vrai si partie en cours faux sinon 
	 */
	public boolean getEtatPartie()
	{
		return this.etatPartie;
	}
	

}

	
	
	
	
	