package day11.interface1;

public class Test01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		//System.out.println(c1.area());
		
		Rectangle r1 =new Rectangle(3,4);
		//System.out.println(r1.area());
		
		Shape[] s ={c1,r1};			// 이런식으로  선언하여 넓이 출력이 가능하다.
		for(int i=0;i<s.length;i++){
			System.out.println(s[i].area());
			if(s[i] instanceof Drawable)			// 다운캐스팅 하기전에 가능유무 확인!
				((Drawable)s[i]).draw();
		}
		System.out.println("==========================");
		ShapeDrawable[] ad = {c1,r1};
		ad[0].draw();
		System.out.println(ad[0].area());
	}
}
