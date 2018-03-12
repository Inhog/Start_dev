package util;

public class MyMath {
	
	public static int add(int ... num){			// 가변인자 -> 가변인자는 배열로 처리된다.
		int sum =0;
		for(int i=0;i<num.length;i++){
		sum += num[i];
		}
		return sum;
	}
	public static int subtract(int num1,int num2){
		return num1>=num2?num1-num2:num2-num1;
	}
	public static int multiply(int num1,int num2){
		return num1*num2;
	}
	public static int divide(int num1,int num2){
		return num1>=num2?num1/num2:num2/num1;
	}
}
