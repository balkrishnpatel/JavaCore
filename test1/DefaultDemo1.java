package test1;

public interface DefaultDemo1 {
	abstract void m2();
	default void m1() {
		 System.out.println("Default Method 1");
		 } 

}
