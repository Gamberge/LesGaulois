package personnages;

public class Gaulois {
	private int force;
	private String nom;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		force = (force / 3) * effetPotion;
		romain.recevoirCoup(force);
	}
	
	public void boirePotion(int forcePotionDruide) {
		effetPotion = forcePotionDruide;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
	}
	
	
	 @Override public String toString() { return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]"; }
	 
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix",8);
		Romain minus = new Romain ("Minus", 2);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Bonjour");
		asterix.boirePotion(panoramix.preparerPotion());
		asterix.frapper(minus);
	}
}

