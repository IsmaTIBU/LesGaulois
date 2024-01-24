package personnages;

public abstract class Personnage {
	private String nom;
	private int force;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String phrase) {
		System.out.println(donnerAuteur() + getNom() + ": '" + phrase + "'");
	}

	protected abstract String donnerAuteur();

	public void frapper(Personnage personnage) {
		personnage.recevoirCoup(force / 3);
	}

	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force < 0) {
			force = 0;
		}
		if (force == 0) {
			System.out.println(donnerAuteur() + getNom() + ": " + "J'abandonne");
		} else {
			System.out.println(donnerAuteur() + getNom() + ": " + "Aïe !");
		}
	}

}
