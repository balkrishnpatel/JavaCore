package test1;

public class overaiding {
public void m1() {
	System.out.println("hello");
}
public void marry() {
	System.out.println("subha maxmi");
}
}
class demo2 extends overaiding{
	public void marry() {
		System.out.println("3sha + nitya + 9tara");
		
	}
 public static void main(String[] args) {
	overaiding T= new overaiding ();
	T.marry();
	demo2 D=new demo2();
	D.marry(); 
	
}
}
