package personnages;

import java.security.SecureRandom;
import java.util.Random;


public class Druide extends Gaulois{
	
	protected int quantitePotion;
	protected int puissancePotion;
	Random random;
	
	public Druide(String nom) {
        super(nom,0);
        
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public void fabriquePotion(int quantitePotion) {
		this.quantitePotion = quantitePotion;
		int minPuissance = 1;
        int maxPuissance = 10;
        this.puissancePotion = random.nextInt(maxPuissance - minPuissance + 1) + minPuissance;	
    }
	
	public int getnbpos() {
		return quantitePotion;
	}
	
	public int getpuiss() {
		return puissancePotion;
	}
}
