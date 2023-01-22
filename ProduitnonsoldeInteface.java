package tp8;

public class ProduitnonsoldeInteface implements ProductInterface{
	private String designation;
	private float prix;
	private int quantite;
	@Override
	
	public void affiche() {
		System.out.println(" designation :"+designation+" ----prix :"+prix+" ---quantite :"+quantite);
	}

	@Override
	public float calcul() {
		
		 return this.prix*this.quantite;
	}

}
