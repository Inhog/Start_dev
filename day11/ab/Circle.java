package day11.ab;

public class Circle extends Shape {
	double radius;

	@Override
	double area() {
		return Math.PI*radius*radius;
	}
}

abstract class Shape{			// 추상클래스로 인해 어느정도 코드의 기반을 다져놓을 수 있다.
	protected double area;
	abstract double area();
}