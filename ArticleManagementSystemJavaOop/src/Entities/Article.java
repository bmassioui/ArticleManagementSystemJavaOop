/**
 * 
 */
package Entities;

/**
 * @author bob
 *
 */
public abstract class Article implements IArticle{
	protected String ref;

	public Article(String ref) {
		this.ref = ref;
	}
}
