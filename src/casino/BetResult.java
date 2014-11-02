package casino;

public enum BetResult {
	WonGame ("Gagn�"),
	NotEnoughMoney ("Plus d'argent, perdu"),
	WonBet ("Pari gagn�"),
	LostBet ("Pari perdu");
	
	private String name = "";
	
	BetResult(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
