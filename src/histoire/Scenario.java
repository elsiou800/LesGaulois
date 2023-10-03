package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois ("Asterix", 8);
		Romain Minus = new Romain ("Minus", 6 );
		System.out.println(Asterix.prendreParole() + "Bonjour à tous");
		System.out.println(Minus.prendreParole() + "UN GAU... UN GAUGAU...");
		Asterix.frapper(Minus);
		System.out.println(Minus.prendreParole() + "Aïe");
		Asterix.frapper(Minus);
		System.out.println(Minus.prendreParole() + "J'abandonne");
		
		
		

	}

	private static String prendreParole() {
		// TODO Auto-generated method stub
		return null;
	}

}
