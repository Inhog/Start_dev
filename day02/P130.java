package day02;

public class P130 {

	public static void main(String[] args) {
		
		char c = 'f';
		
		boolean b = '0'<= c && '9' >= c;
		
		System.out.println(c+ "숫자인지? " + b);
		boolean b2 = 97 <= c && c <= 122;
		System.out.println(c+ "소문자인지? " + b2);
		/*
		if(97 <= c && c <= 122){
		System.out.printf("%c 는 소문자입니다.\n ",c);
		}
		
		if('0'<= c && '9' <=c){
		System.out.printf("%c 는 숫자입니다.\n ",c);
		}
		*/
		

	}

}
