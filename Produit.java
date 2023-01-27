package tp8;

public abstract class  Produit implements Magasin {
	private String designation;
	private float prix;
	private int quantite;
	Produit(String d,float p,int q){
		designation=d;
		prix=p;
		quantite=q;
	}
	public void affiche() {
		System.out.println(" designation :"+designation+" ----prix :"+prix+" ---quantite :"+quantite);
	}
	public float getprix() {
		return prix;
	}
	
	public float getquantite() {
		return quantite;
	}
	public String getdesignation() {
		return designation;
	}
}
