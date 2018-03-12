package day09;

public class Test02 {
	public static void main(String[] args) {
		Dog d =new Dog("진돗개","케리");
		d.print();
		System.out.println(d.kind);
		System.out.println(((Animal)d).kind);  //요것이 업캐스팅
	}
}
