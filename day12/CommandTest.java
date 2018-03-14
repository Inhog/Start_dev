package day12;

public class CommandTest {
	public static void main(String[] args) {
		Command cmd =null;
		switch(args[0]){
			case "Delete":
				cmd = new DeleteCommand();
				break;
			case "Update":
				cmd = new UpdateCommand();
				break;
			case "Insert":
				cmd = new InsertCommand();
				break;
			case "Select":
				cmd = new SelectCommand();
				break;
			default:
				break;
		}
		cmd.exec();
		cmd.print();
	}
}

interface Command{
	public abstract void exec();
	default void print(){
		System.out.println("Command print");
	}			// 기존에 동작하는 인터페이스에 default형 메소드를 추가할 수 있다. -> 기능확장 
}

class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("Insert 수행 Command");
	}
	public void print(){
		System.out.println("InsertCommand print");
	}
	
}
class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("Delete 수행 Command");
		
	}
	
}
class SelectCommand implements Command{

	@Override
	public void exec() {
		System.out.println("Select 수행 Command");
		
	}
	
}
class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("Update 수행 Command");
		
	}
	
}