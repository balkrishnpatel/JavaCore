
public abstract class TestAbs {
	public abstract void m1();
	public void m2() {
		System.out.println("hello");
	}
public static void m3() {
	System.out.println("Static hello");
	Test22 t=new Test22();
	t.m2();
	t.m1();
}
}
