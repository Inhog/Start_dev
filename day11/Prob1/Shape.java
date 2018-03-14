package day11.Prob1;

public abstract class Shape {
	protected int numSides;
	
	public Shape() {}
	public Shape(int numSides) {
		this.numSides = numSides;
	}
	

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	abstract double getArea();		//넓이
}
