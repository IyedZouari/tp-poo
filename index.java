package ex3;

public class index {

	private static final String Sring = null;

	public static void main(String[] args) {
		Livre L1=new Livre();
		Livre L2=new Livre();
		Livre L3=new Livre();
		L1.setNbPages(0);
		L2.setTitre("al-ayam");
		L2.setNbPages(80);
		L3.setAuteur("El castro");
		L3.setNbPages(284);
		L3.setTitre("riselt al ghfran");
		Livre tab[]=new Livre[3];//notion du tableaux
		tab[0]=L1;
		tab[1]=L2;
		tab[2]=L3;
		for (int i=0;i<3;i++) {
			System.out.print("le"+i+" livre\n");
			tab[i].decrire();
		}
		L2.setAuteur("Paulo Coelho.");
		L3.setNbPages(461);
		for (int i=0;i<3;i++) {
			System.out.print(i+"livre\n");
			tab[i].decrire();
		}
		L1.setPrix(13);
		L2.setPrix(45);
		L2.setPrix(76);
		L1.setPrix(40);
		String t[]=new String[3];
		t[0]=L1.getAuteur();
		t[1]=L2.getAuteur();
		t[2]=L3.getAuteur();
		for (int i=0;i<3;i++) {
			System.out.print("le"+i+" auteur\n"+t[i]);
		}
		System.out.println("le prix: "+L1.getPrix());
		
	
}
}
