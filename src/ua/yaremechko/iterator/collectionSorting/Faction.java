package ua.yaremechko.iterator.collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Faction {

	Scanner sc = new Scanner(System.in);

	public Faction() {

	}

	ArrayList<Deputy> listDeputy = new ArrayList<Deputy>();

	public void addDeputy() {

		System.out.println("Enter data of deputy:");
		System.out.println();

		System.out.println("add firstName: ");
		String firstName = sc.next();
		System.out.println("add secondName: ");
		String secondName = sc.next();
		System.out.println("add age: ");
		int age = sc.nextInt();
		System.out.println("add Weight: ");
		int weight = sc.nextInt();
		System.out.println("addHeight: ");
		int height = sc.nextInt();
		System.out.println("add boolean bribe taker (true or false): ");
		boolean bribeTaker = sc.nextBoolean();

		Deputy deputy = new Deputy(firstName, secondName, age, weight, height, bribeTaker);

		listDeputy.add(deputy);
		System.out.println("deputy is added!!!");
		System.out.println();

		if (bribeTaker == true) {
			deputy.giveBribe();
		}

	}

	public void removeDeputy() {
		System.out.println("enter secondName deputy to remove: ");
		String nameToRemove = sc.next();

		Iterator<Deputy> iterator = listDeputy.iterator();
		while (iterator.hasNext()) {
			Deputy nextDeputy = iterator.next();

			if (nextDeputy.getSecondName().equalsIgnoreCase(nameToRemove)) {
				iterator.remove();
				System.out.println("deputy is removing!!!");
				System.out.println();
			} else {
				System.out.println("deputy is not find!!!");
				System.out.println();
			}
		}
	}

	public void allBribeTaker() {

		System.out.println("list of bribe takers: ");
		for (Deputy deputy : listDeputy) {
			if (deputy.isBribeTaker()) {
				System.out.println(deputy.toString() + " sizeBribe: " + deputy.getSizeBribe());
			}
		}
	}

	public void topBribeTaker() {
		Collections.sort(listDeputy);
		System.out.println("top bribe-taker is: " + Collections.max(listDeputy));
	}

	public void allDeputy() {

		for (Deputy deputy : listDeputy) {
			System.out.println(deputy);
		}
	}

	public void removeAllDeputy() {
		Iterator<Deputy> iterator = listDeputy.iterator();
		while (iterator.hasNext()) {
			Deputy next = iterator.next();
			iterator.remove();
		}
		System.out.println("Deputy is removing");
	}

}
