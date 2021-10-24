package ua.yaremechko.iterator.collectionSorting;

public class Human {

	private int weight;
	private int height;

	public Human(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human [weight=" + weight + ", height=" + height + "]";
	}

}
