package day08.ex;

public class BookMgr {
	private Book[] booklist;	// 변수 우클릭-> Refactor -> Rename
	int count=0;
	public Book[] getBooks() {
		return booklist;
	}

	public void setBooks(Book[] books) {
		this.booklist = books;
	}

	public BookMgr(int size) {			// 필요한 정보를 받아서 그걸 기반으로 생성하는게 생성자
		booklist = new Book[size];
	}

	public BookMgr() {
		booklist = new Book[10];
	}
	
	 public void addBook(Book book){
		 if(count == booklist.length){
			 Book[] temp = new Book[booklist.length*2];
			 System.arraycopy(booklist, 0, temp, 0, booklist.length);
			 booklist = temp;
		 }
		booklist[count]= book;
		count++;
	}
	 
	 public void printBooklist(){
		 System.out.println("====책 목록====");
		 for(int i=0;i<count;i++){
			 System.out.println(booklist[i].getTitle());
		 }
	 }
	 
	 public int printTotalPrice(){
		 System.out.println("====책 가격의 총 합=======");
		 int sum = 0;
		 for(int i=0;i<count;i++){
			 sum+=booklist[i].getPrice();
		 }
		 return sum;
	 }
	 
	 public void searchTitle(String s){
		 for(int i=0;i<count;i++){
			 //if(booklist[i].getTitle().equals(s)){
			 if(booklist[i].getTitle().contains(s.trim())){
				 System.out.println(booklist[i].getTitle());
				 System.out.println(booklist[i].getPrice());
			 }
		 }
	 }
	 public void print(){
		 // booklist 정보 출력
		 for(int i =0; i<count;i++){
			 booklist[i].print();
		 }
	 }
	
	
}
