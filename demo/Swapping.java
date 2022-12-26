package demo;

public class Swapping {
	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("before swapping numbers: "+ a +" "+ b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping no: "+ a +" " + b);
}

}
