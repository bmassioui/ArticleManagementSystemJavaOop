/**
 * 
 */
package Entities;

/**
 * @author bob
 *
 */
public class Ramette extends ArticleSimple{
	private int grammage;

	public Ramette(String ref, String nom, double prix, int grammage) {
		super(ref, nom, prix);
		this.grammage = grammage;
	}
	
	public void afficher() {
		System.out.print("#" + ref + " Ramette " + nom + " " + grammage + " " + getPrix());
	}
}
