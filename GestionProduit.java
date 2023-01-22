package tp8;



public class GrstionProduit {
	public static void main(String[] args) {
		
		 Product [] tabProduit = new Product [5];
		 
		 tabProduit [0]=new Produitnonsolde("veste",50,150);
		 tabProduit [1]=new Produitnonsolde("chaussure",35,90);
		 tabProduit [2]=new Produitnonsolde("pull",20,50);
		 tabProduit [3]=new Produitsolde("jean",15,100);
		 tabProduit [4]=new Produitsolde("manteau",10,200);
		 
		 Product max = tabProduit [0];
		 for(int i=1;i<5;i++) {
				if(tabProduit[i].calcul()>max.calcul()) {
					max=tabProduit[i];
				}
			}
		 max.affiche();
		 	 
	}
	
	
	
}

