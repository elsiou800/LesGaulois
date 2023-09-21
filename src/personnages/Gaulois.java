package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
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
		// TODO Auto-generated method stub
		return null;
	}
}	
