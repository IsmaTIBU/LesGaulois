package test_fontionnel;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour à tous");
		Romain romain=new Romain("Minus",6);
		romain.parler("UN GAU… UN GAUGAU…");
		for(i=0;i<2;i++) {
			romain.recevoirCoup(3);
			romain.parler
		}
	}
}
