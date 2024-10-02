package ex3;

class Livre {
private String titre, auteur;
private float nbPages;
final double tva=0.18;
private double prix;
private boolean verif=false;
public Livre (String auteur,String titre) {
this.auteur = auteur;
this.titre = titre;
}
public Livre() {
	// TODO Auto-generated constructor stub
}
public String getAuteur() {
return this.auteur;
}
public void setNbPages (int nb) {
if (nb>20)
	this.nbPages=nb;
else
	System.out.println("le nombre indiqué est faible.");
}
public void setAuteur(String auteur) {
	this.auteur=auteur;
}
public void setTitre(String titre) {
	this.titre=titre;
}
public String getTitre() {
	return this.titre;
}
public float getnbPages() {
	return this.nbPages;
}
public String  toString() {
	return ("Le Livre intitulé "+this.titre+"de "+this.auteur+"Contenant"+this.nbPages+"Pages ave prix egale :"+this.prix+ " DT");
}
public void decrire() {
System.out.println(toString());	
}
public double getPrix() {
	return (this.prix*tva)+this.prix;
}
public void setPrix(double prix) {
	if (this.verif==false) {
		this.prix=prix;
		verif=true;
		System.out.println(this.prix);
}
	else
		System.out.println("impossible de modifier");
}
public boolean testPrix() {
	if (this.prix != 0)
		return true;
	return false;
}

}