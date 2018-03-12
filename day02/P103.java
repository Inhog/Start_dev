package day02;

public class P103 {

	public static void main(String[] args) {
		
		char c1 = 'a'; 
		char c2 = c1;
		System.out.printf("c1= %c c2 = %c\n",c1,c2);
		
		System.out.println(c1+1);
		System.out.printf("c1 = %d , %s , %c\n",(int)c1,c1,c1);
		
		
		c1= 'a';
		for(int i=0;i<26;i++){
			System.out.printf("%c => %c, ASCII => %d\n",c1,(c1-32),c1-32);
			c1++;
		}
		
	}

}
