
public class TestConstrutor {

	TestConstrutor(double d) {
		
		System.out.println("double-argument constructor");
	
	}

	TestConstrutor(int i) {
		this(10.5);
		System.out.println("int-argument constructor");
	}

	TestConstrutor() {
		this(10);
		System.out.println("no-argument constructor");
	}

	public static void main(String[] args) {
		TestConstrutor t1 = new TestConstrutor(); 
		TestConstrutor t2 = new TestConstrutor(10);
		TestConstrutor t3 = new TestConstrutor(10.5);
	}

}
