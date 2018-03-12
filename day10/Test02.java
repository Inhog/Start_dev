package day10;

public class Test02 {

	public static void main(String[] args) {
		
		Animal a = new Dog("삽살개","쫑쫑");
		a.breath();
		
		Animal b = new Fish("물고기","금붕어");
		b.breath();
		
		Animal[] animals ={a,b};
		animals[0].breath();
		animals[1].breath();
	}

}
