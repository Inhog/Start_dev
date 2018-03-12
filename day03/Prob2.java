package day03;

public class Prob2 {

	public static void main(String[] args) {
		int value=0;
		int sum=0;
		for(int i=1;i<=10;i++){
			value += i;
			sum +=value;
		}
		System.out.println(sum);
	}

}
