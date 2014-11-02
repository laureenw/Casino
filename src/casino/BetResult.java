package casino;

public enum BetResult {
	WonGame ("Gagné"),
	NotEnoughMoney ("Plus d'argent, perdu"),
	WonBet ("Pari gagné"),
	LostBet ("Pari perdu");
	
	private String name = "";
	
	BetResult(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
