package fr.iutvalence.java.projet.tetris;

/**
 * @author benmessa
 * Indique l'etat de la partie
 */
public class Partie
{

	/**
	 * EtatPartie
	 * Indique si la partie est en cours
	 * ou est terminé
	 */
	public boolean EtatPartie;
	
	
	
	/**
	 * DemarrerPartie
	 * Indique que la partie à demarrer
	 */
	public void DemarrerPartie()
	{
		this.EtatPartie=true;
	}
	
	
	/**
	 * PartieTermine
	 * Indique quand la partie est terminé
	 */
	public void PartieTermine()
	{
		this.EtatPartie=false;
	}
	
	
}
