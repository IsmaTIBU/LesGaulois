package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		int i;
		Gaulois asterix=new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus", 5);
		asterix.parler("Bonjour à tous");	
		minus.parler("UN GAU... UN GAUGAU...");
		for (i=0;i<6;i++) {
			asterix.frapper(minus);
		}
	}
}
