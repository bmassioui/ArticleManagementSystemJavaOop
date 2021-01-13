/**
 * 
 */
package Entities;

/**
 * @author bob
 *
 */
public class Lot extends Article{
	private IArticle article;
	private int nbArt;
	private double remise;
			
	public Lot(String ref, IArticle article, int nbArt, double remise) {
		super(ref);
		this.article = article;
		this.nbArt = nbArt;
		this.remise = remise;
	}
	
	public double getPrix() {
		return this.nbArt * article.getPrix() * (100 - remise) / 100;
	}
	
	public void afficher() {
		System.out.print("#" + ref + " Lot " + nbArt + " [");
		article.afficher();
		System.out.print("] " + getPrix());
	}
	
}
