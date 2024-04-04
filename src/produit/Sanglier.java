package produit;

public class Sanglier extends Produit {
	private int poids;
	private String chasseur;
	public Sanglier(int poids,String chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids=poids;
		this.chasseur=chasseur;
		
		
	}

	@Override
	public String descriptionProduit() {
		return getNomProduit()+ " de "+ poids+ Unite.KILOGRAMME+" chassé par "+chasseur;
	}
	
}
