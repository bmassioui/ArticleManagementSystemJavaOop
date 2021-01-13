/**
 * 
 */
package Entities;

/**
 * @author bob
 *
 */
public abstract class ArticleSimple extends Article{
	protected String nom;
	protected double prix;
	public ArticleSimple(String ref, String nom, double prix) {
		super(ref);
		this.nom = nom;
		this.prix = prix;
	}
	
	public double getPrix() {
		return this.prix;
	}
}
