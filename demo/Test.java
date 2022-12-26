package demo;

public class Test {
	int a = 10;
	public static void m2() {
		Test t = new Test();
		System.out.println(t.a);
	}
	public static void main(String[] args) {
		m2();
	}
}
