package test_fontionnel;
import personnages.*;
public class TestGaulois {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU...UN GAUGAU...");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
	}

}		
