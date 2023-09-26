package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	
	}

	public String getNom() {
		
		return nom;
	}

	public void parler(String texte) {
		String parole = prendreParole();
	}

	private String prendreParole() {
		return "Le gaulois " + nom + ":";
	}
	public void frapper(Romain romain) {
		System.out.println(nom +  "envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
		
	}

	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois ("Asterix", 8);
		System.out.println(Asterix);
		System.out.println(Asterix.prendreParole() + "Je suis asterix le gaulois");
		System.out.println(Asterix.parler("je suis asterix"));
		
		
	}
}	
