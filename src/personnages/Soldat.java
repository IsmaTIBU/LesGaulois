package personnages;

public class Soldat extends Romain{
	
	public Grade grade; 
	
	
	public Soldat(String nom, int force, Grade grade) {
		super(nom,force); 
		this.grade = grade; 
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