package personnages;

import equip_Romain.*;

public class Soldat extends Romain {

	public Grade grade;
	public Casque casque;
	public Bouclier bouclier;
	public Plastron plastron;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}
	
	public Grade getGrade() {
        return this.grade;
    }

	private double protection(double force) {
		if (casque.defense > 0) {
			force -= 2;
			System.out.println("Le casque attenue les dégats de " + casque.defense);
		} else {
			casque.defense = 0;
		}
		if (bouclier.defense > 0) {
			force -= 3;
			System.out.println("Le bouclier attenue les dégats de " + bouclier.defense);
		} else {
			bouclier.defense = 0;
		}
		if (plastron.defense > 0) {
			force -= 3;
			System.out.println("Le plastron attenue les dégats de " + plastron.defense);
		} else {
			plastron.defense = 0;
		}
		if (force < 0) {
			force = 0;
		}
		return force;
	}

	public void equiperArmure() {
		if (casque == null) {
			casque = new Casque();
			System.out.println("Le soldat " + nom + " s'équipe d'un casque.");
		} else
			parler("J'ai déja un casque");

		if (plastron == null) {
			plastron = new Plastron();
			System.out.println("Le soldat " + nom + " s'équipe d'un plastron.");
		} else
			this.parler("J'ai déja un plastron");
		if (bouclier == null) {
			bouclier = new Bouclier();
			System.out.println("Le soldat " + nom + " s'équipe d'un bouclier.");
		} else
			this.parler("J'ai déja un bouclier");

	}

	@Override
	public void recevoirCoup(double force) {
		if (casque != null && bouclier != null && plastron != null)
			force = protection(force);
		this.force -= force;
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abandonne...");
		} else {
			this.parler("Aïe !");
		}
	}

}