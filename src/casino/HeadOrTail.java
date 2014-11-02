package casino;

import java.util.Random;
import java.util.Scanner;

public enum HeadOrTail {
		
	Head ("pile"),
	Tail ("face");
	
	private String name = "";
	
	HeadOrTail(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
