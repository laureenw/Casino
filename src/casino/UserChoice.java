package casino;

public enum UserChoice {
	Continu ("Continuer"),
	Stop ("Arr�ter"),
	Save ("Sauvegarder"),
	Load ("Charger");
	
	private String name = "";
	
	UserChoice(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
