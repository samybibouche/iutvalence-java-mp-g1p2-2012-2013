package fr.iutvalence.java.projet.tetris.tests;
import java.util.Scanner;
import fr.iutvalence.java.projet.tetris.*;
import java.awt.*;


/**
 * @author benmessa
 * 
 * Ce qu'on veut ?
 * 
 * Lancer une partie de tetris
 * 
 * Comment ?
 * 
 * On créer une grille vierge dans un premier temps, on effectue ensuite une instanciation
 * de cette grille. 
 * 
 * Ensuite, on code une procédure run() qui s'occupe de gérer la partie
 * 
 */
public class runTetris
{
	/**
	 * Déclaration de la grille initialement rempli de "."
	 * 
	 *  Il s'agit du terrain sur le quel nous allons instancier tout nos Tetriminos
	 *  et effectuer diverses méthodes.
	 * 
	 */
	static String [][] grille =
			{
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },  // 0
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },  // 1
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },  
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },  
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },  
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },  // HAUTEUR_MAX
			};
	
	
	/**
	 * La méthode charger le lancer et gérer la partie.
	 * 
	 * La premiere boucle (do) permet d'instancier des Tetriminos
	 * 
	 * La seconde boucle est composé : d'un scan qui selon l'entier entrée par le joueur 
	 * effectue une action : 1. gauche; 2. descendre; 3. droite; 5. rotation
	 * 
	 */
	public static void run()
    {
	 
           try
           {
            	Partie p =new Partie();
            	Score s = new Score();
            	p.demarrerPartie();            	
                   
                		Grille g = new Grille(grille);
                		int R; // Correspond à l'entier entré par l'utilisateur dans la console
                		
                		do
                		{                			
                			Tetrimino t = Partie.randomTetrimino(); 
                			g.nouveauTetrimino(t);
                			int tomberAuto=0; // Un entier pour faire automatique tomber la piece d'un cran
                			// lorsque l'utilisateur se deplace à gauche ou à droite 3 fois de suite
                			
	                		do
	                        {                		
	                			System.out.println(g);
	                			
			            		Scanner sc = new Scanner(System.in);
			            		System.out.print("Faire un choix \n");
			            		System.out.print("1. Gauche   2. Faire Descendre   3. Droite   5. Rotation\n");
			            		R = sc.nextInt();                		
			            		
			            		if (R == 1) { System.out.print("Deplacement à gauche \n");}			            		
			            		if (R == 2) { System.out.print("Faire Descendre la piece \n");}			            		
			            		if (R == 3) { System.out.print("Deplacement à droite\n");}			            		
			            		if (R == 5) { System.out.print("Faire une rotation \n");}

			            		// Affichage des données de jeux
		            			System.out.println("Position X :"+g.getPosX());
		                		System.out.println("Position Y :"+g.getPosY());
		            			System.out.println("Piece en bas :"+g.getEtatPiece());
		            			
		            			
		            			//Thread.currentThread();
								//Thread.sleep(500);
		            			
		            			switch(R) {
		            			
			            			case 1:
		            				if (R == 1)
									{
										if (g.getPosX()>0) 
										{
											if (tomberAuto<2)
											{
												g.gaucheTetrimino();
												tomberAuto++;
											}
											else
											{
												g.gaucheTetrimino();
												g.tomberTetrimino();
												tomberAuto=0;
											}
										}
									}
		            				break;
		            				
			            			case 2:
		            				if (R == 2)
									{
										g.tomberTetrimino();
										
										if(g.getEtatPiece())
										{
											g.setEtatPiece(false);
										    g.arrangerGrille();
											Tetrimino Nouv = Partie.randomTetrimino();
					                		g.nouveauTetrimino(Nouv);
					                		
										}
									}
		            				break;
		            				
			            			case 3:
		            				if (R == 3)
									{
										if (g.getPosX()<9)  
										{
											if (tomberAuto<2)
											{
												g.droiteTetrimino();
												tomberAuto++;
											}
											else
											{
												g.droiteTetrimino();
												g.tomberTetrimino();
												tomberAuto=0;
											}
										}
									}
		            				break;
		            				
			            			case 5:
		            				if (R == 5)
									{
										g.retournerTetrimino(t, g.getPosX(), g.getPosY());
									}
		            				break;
		            				
		            			}
														             		
	                		
	                        }while(true); 
                		

                		
                    }while(true);
                		
                		
            }
           catch(Exception e) { }
        
    }
	
	
	
	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            Aucun
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException
	{
		run();
		
	}
	
	

}

