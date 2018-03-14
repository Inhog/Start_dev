package day12;

public class test {
public static void main(String[] args) {
	int a=10, b=3, c=0;
	c=(++a)+(b--);
	c=(--c)+(c--);
	System.out.println(c);
}
}
