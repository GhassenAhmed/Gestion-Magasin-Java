package tp8;

public class ProduitsoldeInterface implements ProductInterface {
	private String designation;
	private float prix;
	private int quantite;
	private int taux;
	@Override
	public void affiche() {
		System.out.println(" designation :"+designation+" ----prix :"+prix+" ---quantite :"+quantite);	
	}
	@Override
	public float calcul() {
		
		return this.prix*(1+(this.taux/100)*this.quantite);
	}
	
}
