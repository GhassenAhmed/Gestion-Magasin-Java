package tp8;

public class Productnonsolde extends Produit{
	Productnonsolde(String d,float p,int q){
		super(d,p,q);
	}
	@Override
	public float calcul() {
		
		return this.getprix()*this.getquantite();
	}
	
}
