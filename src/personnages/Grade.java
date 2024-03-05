package personnages;

public enum Grade {
	SOLDAT("soldat"), TESSERARIUS("tesserarius"), OPTIO("optio"), CENTURION("centurion");

	private final String description;

	Grade(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}
