package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix",8);
		Gaulois obelix = new Gaulois ("Obélix", 10);
		Romain minus = new Romain ("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		int forcePotion = panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bénélos, ce n'est pas juste !");
		asterix.boirePotion(forcePotion);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
