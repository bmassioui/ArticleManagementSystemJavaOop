/**
 * 
 */
package Entities;

/**
 * @author bob
 *
 */
public class Programme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IArticle a = new Stylo("11", "Bic", 1.5, "Bleu");
		a.afficher();  		System.out.println();
		
		IArticle b = new Lot("22", a, 3, 20);
		b.afficher();       System.out.println();
		
		IArticle c = new Lot("33", b, 2, 0);
		c.afficher();       System.out.println();
	}

}
