package personnages;

public abstract class Personnage {
	
	
	protected String nom;
	protected int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	public void parler(String paroles) {
		System.out.println("Le " + donnerAuteur() +" " + nom + " : " + "\""+paroles+"\"");
	}
	
	public void frapper(Personnage adversaire) {
		System.out.println("Le " + donnerAuteur() + " " + this.getNom() + " envoie un grand coup dans la mâchoire du "
				+ adversaire.donnerAuteur() + " " + adversaire.getNom());
			adversaire.recevoirCoup(force / 3);
	}
	public void recevoirCoup(double force) {
		this.force -= force;
		
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abandonne...");
		} else {
			this.parler("Aïe !");
			
		}
	}
	
	public boolean persoKO() {
	    return this.force <= 0;
	}
	
	public String getNom() {
		return nom;
	}
	
	protected abstract String donnerAuteur();
	
}