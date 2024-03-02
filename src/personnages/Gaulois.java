package personnages;

import equip_Gaulois.Potion;

public class Gaulois extends Personnage {
	private double puissancePotion = 1.0;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	public String donnerAuteur() {
		return "gaulois";
	}

	public void boirePotion(Potion potion) {
		if ("Obélix".equals(this.nom)) {
			this.parler("Non, non, non ! Je n'ai pas le droit de boire de la potion magique !");
			return;
		}
		this.puissancePotion = potion.getPuissance();
		this.parler("boit une potion de puissance " + this.puissancePotion);
	}

	public void setPuissancePotion(int puissance) {
		puissancePotion = puissance;
	}

	@Override
	protected int calculForceFrappe() {
		int forceCoup =  (int) (super.calculForceFrappe() * this.puissancePotion);
		puissancePotion-=0.5;
		if(puissancePotion<1)
			puissancePotion=1;
		return forceCoup;
	}

}