package day02;

public class P24 {

	public static void main(String[] args) {
		int num1= 100;
		int num2 = 77;
		// 성능 저하의 원인 코드으으  -> String에서 + 연산
		System.out.println("num1:" + num1+" num2:" + num2);
		//num1 값과 num2 값 바꾸기 
		int a=num1;
		num1 = num2;
		num2 = a;
	
		//p36	
		System.out.printf("num1: %d num2 : %d\n",num1,num2);
		System.out.printf("%5.2f %n",3.14*3*3);		//P37    %-5d 이러면 왼쪽 정렬? 
		String name = "홍길동";
		System.out.printf("%10s 님 \n",name);
		
		byte b = 0;
		b = (byte)200;
		System.out.println(Byte.MIN_VALUE + "~"+Byte.MAX_VALUE);
		System.out.printf("Byte 범위 %d ~ %d \n", Byte.MIN_VALUE,Byte.MAX_VALUE);
		
		System.out.printf("Integer 범위 %d ~ %d \n", Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		int sum =Integer.parseInt("100")+ 500;
		
		}

}
