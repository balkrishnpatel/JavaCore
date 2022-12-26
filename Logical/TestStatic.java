package Logical;

public class TestStatic {
	static int a;
	static void m1() {System.out.println("hello");}
	public static void main(String[] args) {
		System.out.println(a);
		TestStatic.m1();
	}

}
