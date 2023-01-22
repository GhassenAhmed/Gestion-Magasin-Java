package tp8;

public abstract class Product {
	private String designation;
	private float prix;
	private int quantite;
	Product(String d,float p,int q){
		designation=d;
		prix=p;
		quantite=q;
	}
	public void affiche() {
		System.out.println(" designation :"+designation+" ----prix :"+prix+" ---quantite :"+quantite);
	}
	public abstract float calcul();
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
