package day08.ex;

public class BookApplication {
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(5);		// 5개의 book 객체를 가지는 생성자
		
		Book b1 = new Book("Java Programming 1.8", 29000);
		mgr.addBook(b1);
		
		mgr.addBook(new Book("SQL",22000));
		System.out.println(mgr.printTotalPrice()+"원");
		mgr.searchTitle("Java Programming 1.8");
	}

}
