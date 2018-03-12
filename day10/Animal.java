package day10;

public abstract class Animal {
	String kind ="Animal_kind";
	
	protected Animal(){
		System.out.println("Animal() 수행");
	}
	
	protected Animal(String kind){
		System.out.println("Animal("+kind+") 수행");
		this.kind = kind;
	}
	
	public abstract void breath();
}
