package day04;

public class Prob3 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=1;
		while(sum<100){

			if(i % 2 == 1){
				sum += i;
			}
			else{
				sum -=i;
			}
			i++;
		}
		System.out.println(i);
	}
}
