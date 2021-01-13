/**
 * 
 */
package Entities;

/**
 * @author bob
 *
 */
public class Stylo extends ArticleSimple{
	private String couleur;

	public Stylo(String ref, String nom, double prix, String couleur) {
		super(ref, nom, prix);
		this.couleur = couleur;
	}
	
	public void afficher() {
		System.out.print("#" + ref + " Stylo " + nom + " " + couleur + " " + getPrix());
	}
}
