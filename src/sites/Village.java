package sites;

import personnages.*;

public class Village {

	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[50];
	private int nbVillageois = 0;

	public Village(Gaulois chef) {
		this.chef = chef;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void addVillageois(Gaulois villageois) {
		if (nbVillageois <= this.villageois.length) {
			chef.parler("Désolé " + villageois.getNom() + " mon village est deja bien rempli.");
		} else {
			this.villageois[nbVillageois] = villageois;
			nbVillageois++;
			chef.parler("Bienvenue " + villageois.getNom());
		}
	}

	public void afficherVillage() {
		System.out.println("Le village de " + chef.getNom() + " est habité par: ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + this.villageois[i].getNom());
		}
	}

	public void changerChef(Gaulois gaulois) {
		this.chef.parler("Je laisse mon grand bouclier au grand Abraracourcix");
		this.chef = gaulois;
		this.chef.parler("Merci !");
	}
}
