package tp8;



public class Produitnonsolde extends Product{
	Produitnonsolde(String d,float p,int q){
		super(d,p,q);
	}
	public void affiche() {
		super.affiche();
	}
	
	@Override
	public float calcul() {
		
		return this.getprix()*this.getquantite();
	}
}
