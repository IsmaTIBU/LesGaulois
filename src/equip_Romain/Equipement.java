package equip_Romain;

public enum Equipement {
	CASQUE("casque", 2), BOUCLIER("bouclier", 3), PLASTRON("plastron", 3);

	private String chaine;
	private int protect;

	private Equipement(String chaine, int protect) {
		this.chaine = chaine;
		this.protect = protect;
	}

	public String getNom() {
		return chaine;
	}

	public int getDefense() {
		return protect;
	}
}
