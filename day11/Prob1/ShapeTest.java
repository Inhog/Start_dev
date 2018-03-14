package day11.Prob1;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle ra = new Rectangle(5,6);
		RectTriangle rt = new RectTriangle(6,2);
		
		Shape[] s = {ra,rt};
		
		for(int i=0;i<s.length;i++){
			System.out.println("area: "+ s[i].getArea());
			if(s[i] instanceof Resizable){			// 인터페이스 타입으로 캐스팅할 수 있다면 
				((Rectangle) s[i]).resize(0.5);
				System.out.println("new area: "+s[i].getArea());
			}
		}
	}

}
