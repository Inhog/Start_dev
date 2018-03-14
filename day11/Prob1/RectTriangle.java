package day11.Prob1;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	
	public RectTriangle() {	}
	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width*height*0.5;
	}

}
