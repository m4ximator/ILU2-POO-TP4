package produit;

public abstract class Produit {
	private String nomProduit;
	private Unite unite;
	
	protected Produit(String nomProduit, Unite unite) {
		this.nomProduit = nomProduit;
		this.unite = unite;
	}


	public String getNomProduit() {
		return nomProduit;
	}
	
	
	public abstract String descriptionProduit();
}
