package personnages;

public class Gaulois extends Personnage {
	private double puissancePotion = 1.0;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	public String donnerAuteur() {
		return "gaulois";
	}

	public void setPuissancePotion(int puissance) {
		puissancePotion = puissance;
	}

	@Override
	public void frapper(Personnage adversaire) {
		double forceCoup = (double) (this.force * this.puissancePotion);
		System.out.println("Le " + donnerAuteur() + " " + this.getNom() + " envoie un grand coup dans la mâchoire du "
				+ adversaire.donnerAuteur() + " " + adversaire.getNom());
		adversaire.recevoirCoup(forceCoup);
		this.puissancePotion = Math.max(1.0, this.puissancePotion - 0.5);

	}

}