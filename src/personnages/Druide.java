package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
    private int nombrePotions;
    private int puissancePotion;
    private Random random;

    public Druide(String nom, int force) {
        super(nom, force);
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fabriquerPotion(int quantite) {
        int puissance = 2 + random.nextInt(5);
        this.puissancePotion = puissance;
        this.nombrePotions += quantite;
        this.parler("J'ai concocté " + quantite + " potions de puissance " + puissance);
    }

    public void donnerPotion(Gaulois gaulois) {
        if ("Obélix".equals(gaulois.getNom())) {
            this.parler("Non, Obélix ! Non... Et tu le sais très bien !");
            return;
        }

        if (nombrePotions > 0) {
            gaulois.setPuissancePotion(puissancePotion);
            this.parler("Tiens " + gaulois.getNom()+ " un peu de potion magique.");
            nombrePotions--;
        } else {
            this.parler("Désolé, " + gaulois.getNom() + ", il n'y a plus une seule goutte de potion.");
        }
    }
}
