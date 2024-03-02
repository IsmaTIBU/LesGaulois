package personnages;

import java.security.SecureRandom;
import java.util.Random;

import equip_Gaulois.Potion;

public class Druide extends Gaulois {
	private int nombrePotions;
	private Random random;
	private Potion[] stockPotions;

	public Druide(String nom, int force) {
		super(nom, force);
		stockPotions = new Potion[10];
		nombrePotions = 0;
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fabriquerPotion(int quantite) {
		if (quantite + nombrePotions > stockPotions.length) {
			augmenterTailleStock(quantite + nombrePotions - stockPotions.length);
		}
		int puissance = 2 + random.nextInt(5);
		for (int i = 0; i < quantite; i++) {
			stockPotions[nombrePotions++] = new Potion(puissance);
		}
		this.parler("J'ai concocté " + quantite + " potions de puissance " + puissance);
	}

	public void donnerPotion(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) {
			this.parler("Non, Obélix ! Non... Et tu le sais très bien !");
		} else {

			if (nombrePotions > 0) {
				Potion potion = stockPotions[0];
				System.arraycopy(stockPotions, 1, stockPotions, 0, --nombrePotions);
				stockPotions[nombrePotions] = null;
				gaulois.setPuissancePotion(potion.getPuissance());
				this.parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
				nombrePotions--;
			} else {
				this.parler("Désolé, " + gaulois.getNom() + ", il n'y a plus une seule goutte de potion.");
			}
		}
	}

	private void augmenterTailleStock(int nombreNecessaire) {
		int nouvelleTaille = stockPotions.length + nombreNecessaire;
		Potion[] nouveauStock = new Potion[nouvelleTaille];
		for (int i = 0; i < nombrePotions; i++) {
			nouveauStock[i] = stockPotions[i];
		}
		stockPotions = nouveauStock;
	}
}
