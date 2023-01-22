package tp8;

public class Productsolde extends Produit {
	private int taux;
	Productsolde(String d, float p, int q) {
		super(d, p, q);
		// TODO Auto-generated constructor stub
	}
	public void affiche() {
		System.out.println(" designation :"+getdesignation()+" ----prix :"+getprix()+" ---quantite :"+getquantite());
	}
	@Override
	public float calcul() {
		
		return this.getprix()*(1+(this.taux/100)*this.getquantite());
	}
	
}
