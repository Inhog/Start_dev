package day10;

public class Fish extends Animal{
	String kind;
	
	Fish(){
		super();
	}
	Fish(String kind){
		super();
		this.kind = kind;
	}
	
	Fish(String superkind,String kind){
		super(superkind);
		this.kind =kind;
	}
	
	@Override			//밑 메소드의 이름이 부모클래스에 없으면 밑 메소드는 에러.
	public void breath(){
		System.out.println("아가미~~~");
	}
}
