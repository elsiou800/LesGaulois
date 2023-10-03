package personnages;

public class Romain {
	private String nom ;
	private int force;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
//		System.out.println(prendreParole () + "� " + texte + "�");
	}
	
	public String  prendreParole() {
		return "Le Romain "+ nom + " :";
		
	}
		
	public void recevoirCoup(int forceCoup) {
		force-=forceCoup ;
		if (force<0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		
	}
	public static void main(String[] args) {
		Romain romain = new Romain ("romain", 6);
		System.out.println(romain);
		System.out.println(romain.prendreParole() + "je suis un Romain");
		System.out.println(romain.parler("je suis romain"));
		System.out.println(romain.recevoirCoup(3));
}
}