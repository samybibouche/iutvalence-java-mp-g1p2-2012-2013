package fr.iutvalence.java.projet.tetris;

/**
 * @author benmessa
 * Indique l'etat de la partie
 */
public class Partie
{
	// FIXME attributs ? constructeurs ?
	
	// FIXME ne pas rappeler le nom de l'attribut/méthode dans le commentaire JavaDoc
	// FIXME les noms d'attributs commencent par une minuscule
	
	/**
	 * EtatPartie
	 * Indique si la partie est en cours
	 * ou est terminé
	 */
	public boolean EtatPartie;
	
	
	// FIXME les noms de méthodes commencent par une minuscule
	/**
	 * DemarrerPartie
	 * Indique que la partie à demarrer
	 */
	public void DemarrerPartie()
	{
		this.EtatPartie=true;
	}
	
	
	// FIXME peut-on vraiment décider de l'extérieur que la partie est terminée ?
	/**
	 * PartieTermine
	 * Indique quand la partie est terminé
	 */
	public void PartieTermine()
	{
		this.EtatPartie=false;
	}
	
	
}
