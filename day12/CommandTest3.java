package day12;

public class CommandTest3 {

	public static void main(String[] args) {
		Command delete = ()->{
			System.out.println("delete 수행");
		};
		Command update= ()->	System.out.println("update 수행");
		Command selete= ()->	System.out.println("selete 수행");
		Command insert= ()->	System.out.println("insert 수행");
			// 이게 바로 람다식?!
		
		delete.exec();
		// 추상메소드가 하나?
	}

}
