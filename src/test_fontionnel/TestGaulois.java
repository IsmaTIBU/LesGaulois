package test_fontionnel;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour � tous");
		Romain romain=new Romain("Minus",6);
		romain.parler("UN GAU� UN GAUGAU�");
		int i;
		/*for(i=0;i<2;i++) {
			romain.recevoirCoup(3);
		}*/
		for(i=0;i<3;i++) {
			asterix.frapper(romain);
		}
	}
}
