package day05;

// Create by Inho 2018. 3. 6. 오전 9:18:15
/*
1. int[] num = new int[6]
		   배열 num에 정수 1~45 사이의 난수를 집어넣는다.
		   중복제거한다.
		   정렬후 화면에 출력한다.
*/
public class Prob1 {
	
	public static void main(String[] args) {
		exam1();
	}
	
	public static void exam1(){
		int[] num = new int[6];
		for(int i = 0; i<num.length;i++){
			num[i] = (int)(Math.random()*45);
			for(int j =0;j<i;j++){
				if(num[j]==num[i]){
					i--;
					break;
				}
			}
		}
		for(int i=0;i<num.length-1;i++){
			for(int j =0;j<num.length-1-i;j++){
				if(num[j]> num[j+1]){
					int temp = num[j+1];
					num[j+1]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int k=0;k<num.length;k++)
			System.out.println(num[k]);
	}

}
