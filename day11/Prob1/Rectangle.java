package day11.Prob1;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		this.width = this.width*s;
		this.height = this.height*s;
	}

	@Override
	double getArea() {
		return width*height;
	}

}
