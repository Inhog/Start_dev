package day01;

// Create by Inho 2018. 3. 8. 오후 5:44:30

/*		
 * Book 클래스의 제약조건 
		1. 책 제목(title)과 가격(price)정보를 저장하는 멤버변수가 있어야 한다.
		2. 멤버변수는 모두 private 접근제한자를 가져야 한다. 
		3. 멤버변수를 모두 초기화하는 생성자 메서드가 있어야 한다. 
		4. 멤버변수에 값을 설정하고 리턴하는 setter/getter 메서드가 있어야 한다.
		setTitle(String title) : 멤버변수 title 값을 셋팅하는 메소드
		String getTitle() : 멤버변수 title 값을 반환하는 메소드
		    void setPrice(int price) : 멤버변수 price 값을 셋팅하는 메소드
		int getPrice() : 멤버변수 price 값을 반환하는 메소드 
		5. setter/getter 메서드는 모두 public 접근제한자를 가져야 한다. 
		
		Book  관리를 위한 BookMgr 클래스의 제약조건 
		1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
		2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
		4. Book 객체를 booklist에 등록하는 addBook(Book book) 메서드를 작성하세요
		5. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
		6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 
		
		[실행결과 예시]
		=== 책 목록 ===
		Java Program
		JSP Program
		SQL Fundamentals
		JDBC Program
		EJB Program
		
		=== 책 가격의 총합 ===
		전체 책 가격의 합 : 132000
*/
public class Prob1 {

	public static void main(String[] args) {
		BookMgr bm1 = new BookMgr();
		Book b1 = new Book("Java Program",28000);
		Book b2 = new Book("JSP Program",28000);
		Book b3 = new Book("SQL Fundamentals",25000);
		Book b4 = new Book("JDBC Program",31000);
		Book b5 = new Book();
		b5.setTitle("EJB Program");
		b5.setPrice(28000);
		
		bm1.addBook(b1);
		bm1.addBook(b2);
		bm1.addBook(b3);
		bm1.addBook(b4);
		bm1.addBook(b5);
		bm1.printBookList();
		bm1.printTotalPrice();
	}

}

class Book {
	private String title;
	private int price;

	public Book() {
		super();
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class BookMgr {
	public Book[] booklist = new Book[100];
	public int count =0;
	public int sum =0;
	public BookMgr() {
		super();
	}

	public BookMgr(Book[] booklist) {
		super();
		this.booklist = booklist;
	}

	public void addBook(Book book) {
		this.booklist[count] = book;
				count++;
	}

	public void printBookList() {
		for (int i = 0; i <count ; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}

	public void printTotalPrice() {
		for (int i = 0; i <count; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.printf("전체 책 가격의 합 : %d", sum);
	}
}