package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void recevoirCoup(int forceCoup) {
		force-=forceCoup;
		if(forceCoup<0) {
			force=0;
		}
		if(force==0) {
			System.out.println("Le romain "+getNom()+": "+"J'abandonne");
		}else {
			System.out.println("Le romain "+getNom()+": "+"A�e !");
		}
		
	}
	
	public void parler(String phrase) {
		System.out.println("Le romain "+getNom()+": '"+phrase+"'");
	}
}
