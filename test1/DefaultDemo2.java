package test1;

public interface DefaultDemo2 {
	abstract void m2();
	default void m1() {
		 System.out.println("Default Method2");
		} 


}
