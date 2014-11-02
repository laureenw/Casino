package casino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Gamble {
	
	Scanner sc = new Scanner(System.in);
	private Random generator = new Random();
	private int money;
	Player player;
	private int mise;
	
	public Gamble() {
		// TODO Auto-generated constructor stub
		this.money = 10;
		this.mise = mise;
		this.player = player;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMise() {
		return mise;
	}
	
	public void setMise(int mise) {
		this.mise = mise;
	}
	
	public BetResult bet(HeadOrTail h) {
		System.out.println(HeadOrTail.Head+" ou "+HeadOrTail.Tail+" ? ");
		String choix = sc.next();
		h = HeadOrTail.values()[generator.nextInt(HeadOrTail.values().length)];
		System.out.println("Résultat : "+h.toString());
		if (choix.equals(h.toString())) {
			System.out.println(BetResult.WonBet);
			money+=mise;
		} else {
			System.out.println(BetResult.LostBet);
			money-=mise;
		}
		System.out.println("Voulez vous garder ou doubler votre mise ?");
		String strMise = sc.next();
		if (strMise.equals("garder")) {
			mise=mise;
		} else if (strMise.equals("doubler")) {
			mise=mise*2;
		}
		// normalement si le fichier n'existe pas, il est crée à la racine du projet
		System.out.println(money);
		if (money >= 1000) {
			System.out.println(BetResult.WonGame);
		} else if (money < 1) {
			System.out.println(BetResult.NotEnoughMoney);
		}
		return null;
	}
		
}
