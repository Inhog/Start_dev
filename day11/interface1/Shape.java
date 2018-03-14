package day11.interface1;

public interface Shape {
	abstract double area();
	//void print();

}

interface Drawable{			// ~~able 이면 거진 인터페이스
	/*public abstract 생략되어있는것.*/ void draw();
}

interface ShapeDrawable extends Shape,Drawable{}

//class Circle implements Shape,Drawable{// Shape라는 인터페이스를 구현하겠다 => implements
class Circle implements ShapeDrawable{// Shape라는 인터페이스를 구현하겠다 => implements
	int r;
	
	public Circle(){}
	public Circle(int r){
		super();
		this.r =r;
	}
	
	@Override
	public double area() {
		return Math.PI*r*r;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}		
	@Override
	public void draw(){
		System.out.println(toString() + " 그리기...");
	}
	
}

//class Rectangle extends Object implements Shape,Drawable{
class Rectangle extends Object implements ShapeDrawable{
	int w,h;
	public Rectangle(){}
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	public double area() {
		return w*h;
	}
	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + "]";
	}
	@Override
	public void draw() {
		System.out.println(toString() + " 그리기");
	}
	
	
	
}