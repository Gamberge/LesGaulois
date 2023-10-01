package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement;
	
	public Romain(String nom, int force) {
		assert force > 0;
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
		nbEquipement = 0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		int forceInitiale = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force < forceInitiale;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;

		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + ".");
			} else {
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
				equipements[nbEquipement] = equipement;
				nbEquipement++;
			}
			break;
			
		case 0:
			System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
			equipements[nbEquipement] = equipement;
			nbEquipement++;
			break;
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain ("Minus", 6);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
	}
}

