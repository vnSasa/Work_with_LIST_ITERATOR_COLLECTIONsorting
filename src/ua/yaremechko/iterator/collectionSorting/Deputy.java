package ua.yaremechko.iterator.collectionSorting;

import java.util.Scanner;

public class Deputy extends Human implements Comparable<Deputy> {

	private String firstName;
	private String secondName;
	private int age;
	private boolean bribeTaker;

	private int sizeBribe;

	Scanner sc = new Scanner(System.in);

	public Deputy(String firstName, String secondName, int age, int weight, int height, boolean bribeTaker) {
		super(weight, height);
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getSizeBribe() {
		return sizeBribe;
	}

	public void setSizeBribe(int sizeBribe) {
		this.sizeBribe = sizeBribe;
	}

	public void giveBribe() {
		if (bribeTaker == false) {
			System.out.println("This deputy does not take bribes");
		} else {
			System.out.println("give Bribe: ");
			sizeBribe = sc.nextInt();
			if (sizeBribe > 5000) {
				System.out.println("The police will imprison the deputy");
				this.sizeBribe = sizeBribe;
				System.out.println();
			}
		}
	}

	@Override
	public String toString() {
		return "Deputy [getFirstName()=" + getFirstName() + ", getSecondName()=" + getSecondName() + ", getAge()="
				+ getAge() + super.toString() + ", isBribeTaker()=" + isBribeTaker() + "]";
	}

	@Override
	public int compareTo(Deputy o) {
		return this.sizeBribe > o.getSizeBribe() ? 1 : -1;
	}

}
