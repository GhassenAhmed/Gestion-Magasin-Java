package tp8;



public class Produitsolde extends Product {
	private float taux_remise;
	Produitsolde(String d,float p,int q){
		super(d,p,q);
	}
	public void affiche() {
		super.affiche();
	}

	@Override
	public float calcul() {
		// TODO Auto-generated method stub
		return this.getprix()*(1+(this.taux_remise/100)*this.getquantite());
	}
}
