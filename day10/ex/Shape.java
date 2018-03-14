package day10.ex;

public abstract class Shape {
	protected double area;
	private String name;
	
	public Shape(){}

	public Shape(String name) {
		this.name = name;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print(){
		System.out.printf("%s의 면적은 %5.2f\n",name,area);
	}
	public abstract void calculationArea();
	
	
}

class Circle extends Shape{		//상속
	double radius;
	
	public Circle(){}
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void calculationArea() {		// 추상 클래스를 상속받을땐 강제로 overriding 해야함.
		this.area = Math.PI *radius*radius;
}
}


class Rectangle extends Shape{
	double w,h;
	
	
	public Rectangle(String name, double w, double h) {
		super(name);
		this.w = w;
		this.h = h;
	}


	@Override
	public void calculationArea() {
		this.area = w*h;
	}
}