package practicemaven;

import java.util.*;

/**
 * Hello This is Done By ANKAN SANTRA!
 *
 */

public class App {
	static Scanner sc = new Scanner(System.in);
	static HashSet<Team> set = new LinkedHashSet<>();
	static int flag = 0;

	public static void add() {
		System.out.println("Enter player name :");
		String name = sc.next();

		System.out.println("Player is in a team or not(Y/N)");
		String yn = sc.next();

		if (yn.equalsIgnoreCase("y")) {
			System.out.println("Enter player team :");
			String team = sc.next();

			set.add(new Team(team, new Player(name)));
			System.out.println("Player added successfully");
		}
		if (yn.equalsIgnoreCase("n")) {
			set.add(new Team("", new Player(name)));
			System.out.println("Player added successfully");
		}

	}

	public static void remove() {
		System.out.println("Enter player name to remove:");
		String name = sc.next();

		for (Team t : set) {
			if (t.getPlayer().getName().equalsIgnoreCase(name)) {
				set.remove(t);
				System.out.println("Player " + name + " removed successfully");
				break;
			}

		}

	}

	public static void containsTeam() {
		System.out.println("Enter player name to check team: ");
		String name = sc.next();

		for (Team t : set) {
			if (t.getPlayer().getName().equalsIgnoreCase(name)) {
				if (t.getTeam().equalsIgnoreCase("")) {

					System.out.println("Player " + name + " is not in a team");

					flag = 0;
					break;
				} else {
					System.out.println("Player " + name + " is in a team name :" + t.getTeam());
					flag = 1;
					break;
				}

			}

		}

	}

	public static void display() {

		if (set.isEmpty() == true) {
			System.out.println("Set is empty, please add players");
		} else {
			for (Team t : set) {
				if (t.getTeam().equalsIgnoreCase("")) {
					System.out.println("Player name :" + t.getPlayer().getName() + " and does not have any team ");
					
					} else {
						System.out.println("Player name :" + t.getPlayer().getName() + " and team is :" + t.getTeam());
						
					}
			}
		}
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("1.Add player");
			System.out.println("2.Remove player");
			System.out.println("3.Contains Team or not");
			System.out.println("4.Display player");
			System.out.println("5.Exit");

			System.out.println("Enter choice :");
			int ch = sc.nextInt();
			if (ch <= 0 || ch >= 6) {
				System.out.println("Invalid Input, Please enter number between 1-5");

			} else {

				switch (ch) {
				case 1:
					add();
					break;

				case 2:
					remove();
					break;

				case 3:
					containsTeam();
					break;

				case 4:
					display();
					break;

				case 5:
					System.out.println("Exit Successful");
					System.exit(7);
				}
			}
		}
	}
}
