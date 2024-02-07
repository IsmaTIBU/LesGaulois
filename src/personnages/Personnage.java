package personnages;

public abstract class Personnage {

	private String nom;
	protected int force;

	// constructeur

	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	// méthodes

	public String getNom() {
		return this.nom;
	}

	public void parler(String text) {
		System.out.println(donnerAuteur() + this.nom + ": « " + text + " »");
	}

	public void frapper(Personnage adversaire) {
		System.out.println(donnerAuteur() + this.getNom() + " envoie un grand coup dans la mâchoire de "
				+ donnerAuteur() + adversaire.getNom());
		adversaire.recevoirCoup((this.force / 3));
	}

	public void recevoirCoup(int force) {
		this.force = this.force - force;
		if (this.force < 0) {
			this.force = 0;
		}
		if (this.force > 0) {
			parler("Aïe !");
		} else {
			parler("J'abandonne !");
		}
	}

	public abstract String donnerAuteur();

	// main

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
	}

}