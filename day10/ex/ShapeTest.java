package day10.ex;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shape = new Shape[2];
		
		shape[0] = new Circle("원",10);
		shape[1] = new Rectangle("직사각형",10,20);
		
		for(int i=0;i<shape.length;i++){
			shape[i].calculationArea();			//이 메소드가 없으면 각 도형의 면적은 0.0이 되어버림.
			shape[i].print();
		}
	}
}

