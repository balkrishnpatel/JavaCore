abstract class Check2 {
	static void m3() {
		System.out.println("Hello abs");
	}
}

interface Drawable {
	void m1();
static void m3() {
	System.out.println("Hello interface");
}
default void m4() {
	System.out.println("Drawable.m4() default method");
}
}

public class Check implements Drawable {
	public static void main(String[] args) {
		
		Drawable.m3();
		Drawable c = new Check();
		c.m4();
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}


}
