package day09;

public class Dog extends Animal {
	String kind = "Dog_kind";
	String name;
	
	public Dog() {
		super("강아지");
		//super.kind = "강아지";
	}

	public Dog(String kind, String name) {
		super("강아지");
		//super.kind = "강아지";
		this.kind = kind;
		this.name = name;
	}

	public void print(){
		System.out.printf("Dog[%s, %s, %s] \n",super.kind,kind,name);
	}
}
