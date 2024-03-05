package test_fonctionnel;

import personnages.*;

public class TestGaulois {
	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 1);
		Gaulois obelix = new Gaulois("Obélix", 5);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 5);
		Gaulois abraracourcix = new Gaulois("abraracourcix", 5);
		Gaulois agecanonix = new Gaulois("Agecanonix", 5);
		Druide panoramix = new Druide("Panoramix", 5);
		Soldat minus = new Soldat("Minus", 6, Grade.SOLDAT);

		minus.equiperArmure();
		panoramix.fabriquerPotion(3);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abraracourcix);
		panoramix.donnerPotion(agecanonix);
		asterix.parler("Bonjour à tous");
		System.out.println("\n");
		minus.parler("UN GAU... UN GAUGAU...");

		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
	}
}