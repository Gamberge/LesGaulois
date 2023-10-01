package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int nb) {
		return villageois[nb];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 1; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		/* Gaulois gaulois = village.trouverHabitant(30);
		 * Erreur car on tente d'accéder au 31ème élèment d'un tableau de 30 élèments */
		
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        village.ajouterHabitant(abraracourcix);
        Chef chefDuVillage = new Chef("Abraracourcix", 6, village);
        village.setChef(chefDuVillage);
        
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterHabitant(asterix);
        
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterHabitant(obelix);
        village.afficherVillageois();
        
        /* Gaulois gaulois = village.trouverHabitant(1);
         * System.out.print(gaulois);
         * Ce code renvoie le gaulois Astérix qui correspond au gaulois d'index 1 du tableau villageaois, puisque l'index du premier élèment d'un tableau est 0 */
        
        
        
        
        
        
        
        
	}
}