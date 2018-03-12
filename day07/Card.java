package day07;

public class Card {
	int number;
	String kind;
	public Card(){
		System.out.println("Card()호출");
	}
	static int width=7;
	static int height=15;
	
	public void print(){
		String msg = "~~~~~~~";
		System.out.printf("Card[%s,%d,(%d*%d)]\n",kind,number,width,height);
		return ;
	}
}
