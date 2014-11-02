package casino;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class PrincipalGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre nom ou un pseudo");
		String nom = sc.next();
		Player p = new Player(nom);
		
		System.out.println("Combien voulez vous miser ?");
		Gamble g = new Gamble();
		int mise = sc.nextInt();
		
		while (mise >= g.getMoney()) {
			System.out.println("Votre mise dépasse la somme que vous possédez, veuillez saisir une autre mise");
			mise = sc.nextInt();
			
		}
		g.setMise(mise);
		do {
			System.out.println("[1] "+UserChoice.Continu+"\n"
					+ "[2] "+UserChoice.Stop+"\n"
					+ "[3] "+UserChoice.Save+"\n"
					+ "[4] "+UserChoice.Load);
			int user_choice = sc.nextInt();
			sc.nextLine();
			switch (user_choice) {
			case 1:
				g.bet(null);
				break;
			case 2:
				System.out.println("Bye bye!");
				System.exit(0);
				break;
			case 3:
				System.out.println("Sauvegarde dans le fichier : "+p.getName()+".txt");
				PrintWriter writer;
				try {
					writer = new PrintWriter(p.getName()+".txt");
					writer.println(g.getMoney());
					writer.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
				break;
			case 4:
				System.out.println("Chargement du fichier : "+p.getName()+".txt");
				FileReader read;
				try {
					read = new FileReader(p.getName()+".txt");
					BufferedReader br = new BufferedReader(read);
					String ligne = br.readLine();
					g.setMoney(Integer.parseInt(ligne));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				g.bet(null);
				break;
			default:
				System.out.println("Nous n'avons pas compris votre choix");
			}
		} while (g.getMoney() < 1000 && g.getMoney() > 1);
	}

}
