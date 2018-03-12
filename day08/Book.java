package day08;

// Public > Pro
public class Book {
	private String title;				// public 안쓰면 같은 package 안에서는 문제없이 사용가능
	private int price;
	private String author;
	
	public Book(){
		this("Book 제목",0,"저자이름");		// 생성자는 첫번째 라인에만 허용
		/*title = "Book 제목";
		author = "저자이름";
		price = 0;
		*/
	}
	public Book(String s,int p){
		this(s,p,null);
		/*this.title = s;
		this.price = p;
		*/
	}
	public Book(String s,int p,String a){
		this.title = s;
		this.price = p;
		this.author = a;
	}
	public Book(Book book){
		this(book.title,book.price,book.author);		// 코드 중복 회피
/*		this.price = book.price;
		this.title = book.title;
		this.author = book.author;*/
	}
	public void print(){
		System.out.printf("Book"
				+ "[%s : %5d : %s] \n",title,price,author);
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	public void setPrice(int price){
		if(price<0){
			System.out.println("유효하지 않은 price 값입니다.");
			return;
		}
		this.price = price;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getTitle(){
		return this.title;
	}
	public int getPrice(){
		return this.price;
	}
	public String getAuthor(){
		return this.author;
	}
	
	public static void main(String[] args) {
		new Book().print();
		new Book("자바프로그래밍",25000).print();
		new Book("자바프로그래밍",25000,"홍길동").print();
		
		
		Book b1 = new Book("자바프로그래밍",25000,"홍길동");
		
		b1 =null;
	}
}
