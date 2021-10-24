package ua.yaremechko.iterator.collectionSorting;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		VerhovnaRada rada = new VerhovnaRada();

		while (true) {

			System.out.println();
			menu();
			Scanner sc = new Scanner(System.in);

			switch (sc.nextInt()) {
			case 1: {
				rada.addFaction();
				break;
			}
			case 2: {
				rada.removeFaction();
				break;
			}
			case 3: {
				rada.allFaction();
				break;
			}
			case 4: {
				rada.removeAllDeputyFromFaction();
				break;
			}
			case 5: {
				rada.allDeputyToFaction();
				break;
			}
			case 6: {
				rada.addDeputyToFaction();
				break;
			}
			case 7: {
				rada.removeDeputyFromFaction();
				break;
			}
			case 8: {
				rada.showAllBribeTakers();
				break;
			}
			case 9: {
				rada.showTopBribeTakers();
				break;
			}
			case 0: {
				System.out.println("EXIT");
				System.exit(0);
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + sc.nextInt());
			}

		}

	}

	public static void menu() {

		System.out.println("Enter 1 to add a fraction");
		System.out.println("Enter 2 to delete a specific fraction");
		System.out.println("Enter 3 to display all fractions");
		System.out.println("Enter 4 to clear a specific fraction");
		System.out.println("Enter 5 to display a specific fraction");
		System.out.println("Enter 6 to add a deputy to the faction");
		System.out.println("Enter 7 to remove the deputy from the faction");
		System.out.println("Enter 8 to display a list of bribe-takers");
		System.out.println("Enter 9 to display the largest bribe taker");
		System.out.println("Enter 0 to EXIT");
	}

}
