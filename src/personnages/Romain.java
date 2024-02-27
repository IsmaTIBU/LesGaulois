package personnages;

public class Romain extends Personnage {

	public Romain(String nom, int force) {
		super(nom,force);
	}
	
	@Override
	public String donnerAuteur() {
		return "romain";
	}
	
	@Override
	public void recevoirCoup(double force) {
		this.force -= force;
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abandonne...");
		} else {
			this.parler("Aïe !");
		}
	}
}