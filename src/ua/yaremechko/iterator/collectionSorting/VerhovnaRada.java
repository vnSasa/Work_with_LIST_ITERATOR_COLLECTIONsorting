package ua.yaremechko.iterator.collectionSorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerhovnaRada extends Faction {

	private String nameFaction;

	public VerhovnaRada() {
		super();

	}

	public VerhovnaRada(String nameFaction) {
		super();
		this.nameFaction = nameFaction;
	}

	public String getNameFaction() {
		return nameFaction;
	}

	public void setNameFaction(String nameFaction) {
		this.nameFaction = nameFaction;
	}

	@Override
	public String toString() {
		return "VerhovnaRada [nameFaction=" + nameFaction + "]";
	}

	ArrayList<VerhovnaRada> listFaction = new ArrayList<VerhovnaRada>();

	Scanner sc = new Scanner(System.in);

	public void addFaction() {
		System.out.println("Enter Name of Faction: ");
		String factionName = sc.next();

		VerhovnaRada radaFaction = new VerhovnaRada(factionName);
		listFaction.add(radaFaction);
	}

	public void removeFaction() {
		System.out.println("enter name faction to remove: ");
		String nameFactionToRemove = sc.next();

		Iterator<VerhovnaRada> iterator = listFaction.iterator();
		while (iterator.hasNext()) {
			VerhovnaRada nextFaction = iterator.next();

			if (nextFaction.getNameFaction().equalsIgnoreCase(nameFactionToRemove)) {
				iterator.remove();
				System.out.println("Facion is removing!!!");
			} else {
				System.out.println("Faction is not find!!!");
			}
		}

	}
	
	public void removeAllDeputyFromFaction() {
		System.out.println("enter name faction to remove: ");
		String nameFactionToRemove = sc.next();

		for (VerhovnaRada verhovnaRada : listFaction) {
			if(verhovnaRada.getNameFaction().equalsIgnoreCase(nameFactionToRemove)) {
				verhovnaRada.removeAllDeputy();
			}
		}
	}

	public void allFaction() {

		for (VerhovnaRada verhovnaRada : listFaction) {
			System.out.println(verhovnaRada);
		}
	}

	public void addDeputyToFaction() {
		System.out.println("enter name to Faction: ");
		String nameFactionToAdd = sc.next();

		for (VerhovnaRada verhovnaRada : listFaction) {
			if (verhovnaRada.getNameFaction().equalsIgnoreCase(nameFactionToAdd)) {
				verhovnaRada.addDeputy();
			}
		}
	}

	public void removeDeputyFromFaction() {
		System.out.println("enter name to Faction: ");
		String nameFactionRD = sc.next();

		for (VerhovnaRada verhovnaRada : listFaction) {
			if (verhovnaRada.getNameFaction().equalsIgnoreCase(nameFactionRD)) {
				verhovnaRada.removeDeputy();
			}
		}
	}

	public void showAllBribeTakers() {
		System.out.println("enter name to Faction: ");
		String nameFactionToShowBT = sc.next();

		for (VerhovnaRada verhovnaRada : listFaction) {
			if (verhovnaRada.getNameFaction().equalsIgnoreCase(nameFactionToShowBT)) {
				verhovnaRada.allBribeTaker();
			}
		}
	}

	public void showTopBribeTakers() {
		System.out.println("enter name to Faction: ");
		String nameFactionToShowTopBT = sc.next();

		for (VerhovnaRada verhovnaRada : listFaction) {
			if (verhovnaRada.getNameFaction().equalsIgnoreCase(nameFactionToShowTopBT)) {
				verhovnaRada.topBribeTaker();
			}
		}
	}

	public void allDeputyToFaction() {
		System.out.println("enter name to Faction: ");
		String nameFactiontoShow = sc.next();

		for (VerhovnaRada verhovnaRada : listFaction) {
			if (verhovnaRada.getNameFaction().equalsIgnoreCase(nameFactiontoShow)) {
				System.out.println("Faction " + nameFactiontoShow);
				verhovnaRada.allDeputy();
			}
		}
	}

}
