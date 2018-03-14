package day12;

public class CommandTest2 {
	public static void main(String[] args) {
		//Command delete = new Delete();
		Command delete = new Command(){
			public void exec(){
				System.out.println("delete 작업 수행");
			}
		};
		// Command를 implements 한 클래스를 만들거니까 메모리에 띄워라 
		// 이게 익명클래스 -> 선언부에서 정의하고 메모리에 띄워버림
		Command update = new Command(){
			@Override
			public void exec(){
				System.out.println("update 작업 수행");
			}
		};
		Command select = new Command(){
			public void exec(){
				System.out.println("select 작업 수행");
			}
		};
		Command insert = new Command(){
			public void exec(){
				System.out.println("insert 작업 수행");
			}
		};
		delete.exec();
		update.exec();

		
	}
}

class Delete implements Command{

	@Override
	public void exec() {
		
	}
}