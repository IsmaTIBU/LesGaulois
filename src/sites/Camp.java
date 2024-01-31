package sites;

import personnages.*;

public class Camp {
    private Soldat commandant;
    private Soldat[] soldats = new Soldat[80];
    private int nbsoldat = 0;

    public Camp(Soldat commandant) {
        this.commandant = commandant;
    }

    public Soldat getCommandant() {
        return commandant;
    }

    public void addsoldat(Soldat soldat) {
        if (nbsoldat <= this.soldats.length ) {
            commandant.parler("Désolé " + soldat.getNom() + " mon camp est complet !");
        } else {
            soldats[nbsoldat] = soldat;
            nbsoldat++;
            soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom());
        }
    }

    public void afficherCamp() {
        System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats : ");
        for (int i = 0; i < nbsoldat; i++) {
            System.out.println("- " + soldats[i].getNom());
        }
    }

    public void changerCommandant(Soldat nouveauCommandant) {
        if (nouveauCommandant.getGrade() != Grade.CENTURION) {
            nouveauCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
        } else {
            this.commandant = nouveauCommandant;
            nouveauCommandant.parler("Moi " + nouveauCommandant.getNom() + " je prends la direction du camp romain.");
        }
    }
}
