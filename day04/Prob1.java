package day04;
public class Prob1 {

	public static void main(String[] args) {
		
		String[] input = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		String[] output = new String[input.length];
		char value;
		for(int i=0;i<input.length;i++){
			output[i]="";
			for(int j = input[i].length()-1;j>=0;j--){
				value = input[i].charAt(j);
				output[i] += value;
			}
			System.out.println(output[i]);
		}
		
		System.out.println(" String buffer 사용방법");
		System.out.println("========================");
		
		StringBuffer[] result = new StringBuffer[input.length];
		
		for(int i=0;i<input.length;i++){
			StringBuffer s = new StringBuffer(input[i]);
			result[i]=s.reverse();
			System.out.println(result[i]);
		}
		System.out.println(" 객체새롭게 선언 안하는 방법");
		System.out.println("========================");
		
		for(int i=0;i<input.length;i++){
			for(int j=input[i].length()-1;j>=0;j--){
				System.out.print(input[i].charAt(j));
			}
			System.out.println("");
		}
	}
}