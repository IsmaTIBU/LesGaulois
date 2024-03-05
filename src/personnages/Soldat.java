package personnages;

import equip_Romain.*;

public class Soldat extends Romain {

	public Grade grade;
	private Equipement casque = null;
	private Equipement bouclier = null;
	private Equipement plastron = null;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}

	private double protection(double force) {
		if (casque.getDefense() > 0) {
			force -= 2;
			System.out.println("Le casque absorbe " + Equipement.CASQUE.getDefense() + " du coup.");
		} else {
			casque = null;
		}
		if (bouclier.getDefense() > 0) {
			force -= 3;
			System.out.println("Le bouclier absorbe " + Equipement.BOUCLIER.getDefense() + " du coup.");
		} else {
			bouclier = null;
		}
		if (plastron.getDefense() > 0) {
			force -= 3;
			System.out.println("Le plastron absorbe " + Equipement.PLASTRON.getDefense() + " du coup.");
		} else {
			plastron = null;
		}
		if (force < 0) {
			force = 0;
		}
		return force;
	}

	public void equiperArmure() {
		if (casque == null) {
			casque = Equipement.CASQUE;
			System.out.println("Le " + grade.getDescription() + " " + nom + " s'équipe d'un casque.");
		} else
			parler("J'ai d�ja un casque");

		if (plastron == null) {
			plastron = Equipement.PLASTRON;
			System.out.println("Le" + grade.getDescription() + " " + nom + " s'équipe d'un plastron.");
		} else
			this.parler("J'ai d�ja un plastron");
		if (bouclier == null) {
			bouclier = Equipement.BOUCLIER;
			System.out.println("Le" + grade.getDescription() + " " + nom + " s'équipe d'un bouclier.");
		} else
			this.parler("J'ai d�ja un bouclier");

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