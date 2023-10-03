package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour ,je suis le druide " + nom + "et ma potion peut aller d'une force" + effetPotionMin + "�" + effetPotionMax + ".");
		
		
}
public void preparerPotion() {
	Random r = new Random();
	r.nextInt(effetPotionMax);
	if (effetPotionMax > 7) {
	System.out.println( "J'ai préparé une super potion de force" + r.nextInt(9));
	}
	else {
		System.out.println( "Je n'ai pas trouvé tous les ingrédients, ma potion est seulemet de force"+ r.nextInt(9));
	}
		
	
}

public String getNom() {
	return nom;
}
public void parler(String texte) {
	System.out.println(prendreParole() + "�" + texte + "�");
	
}
private String prendreParole() {
	return "Le druide " + nom + ":";
	
}

public static void main(String[] args) {
	Druide Panoramix = new Druide ("Panoramix", 5, 10);
	Panoramix.preparerPotion();
}
}	
	
	

