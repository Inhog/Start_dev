package day02;

public class Test01 {
		public static void main(String[] args) {
			char c = 'A';		// A=>65 , a => 97
			boolean flag = true;
			System.out.println(c+" "+flag);
			flag = (c =='A');
			System.out.println(flag);
			System.out.println(c);
			System.out.println((int)c);
			int cc= c;
			System.out.println(cc);
			String name1 = new String("홍길동");
			System.out.print(name1.charAt(0));
			System.out.println("씨");

			String name2 = "홍길동";
			String name3 = null;
			System.out.println(name3);
			name3 = name1;
			System.out.println(name3);
			name1 =null;
			name3 =null;		// 메모리를 쓸일 없을 때 
			
		}
}