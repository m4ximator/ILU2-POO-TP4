package produit;

public class Poisson extends Produit{
	private String datePeche;
	protected Poisson( String datePeche) {
		super("poisson",Unite.KILOGRAMME);
		this.datePeche=datePeche;
	}

	@Override
	public String descriptionProduit() {
		StringBuilder chaine= new StringBuilder();
		chaine.append(getNomProduit()+" peches "+datePeche);
		return chaine.toString();
	}

}
