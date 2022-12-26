
public class TestOverLoading {
	public  int  m1(float f) {
		System.out.println("hello");
		return 0;
	}
	public void m1(int i) {
		System.out.println("hello Int");
		
	}
	public static void main(String[] args) {
		//System.out.println("hello");
		TestOverLoading t = new TestOverLoading();
		t.m1(0);
		t.m1(3.3f);
		
	}
}



