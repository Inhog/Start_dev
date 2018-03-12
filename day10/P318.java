package day10;

public class P318 {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(3,3),6,"RED");
		c1.print();
		c1.draw();
		
		Circle c2 = new Circle(new Point(9,9),2,"BLACK");
		c2.print();
		c2.draw();
	}
}


class Point{
	int x;
	int y;
	public Point(){}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void print(){
		System.out.printf("Point[%d,%d]\n",x,y);
	}
}

class Shape{
	String color;
	public Shape(){}
	public Shape(String color) {
		this.color =color;
	}
	public void draw(){
		System.out.println(color + "로 도형 그리기");
	}
}

class Circle extends Shape{
	Point p;
	int r;
	public Circle(){}
	public Circle(Point p, int r, String color) {
		super(color);
		//super.color = color;
		this.p = p;
		this.r = r;
	}
	public void print(){
		if(p!=null)p.print();
		System.out.println("반지름 :"+r);
	}
}

class Triangle extends Shape{
	//Point p1,p2,p3;
	Point[] point = new Point[3];
}