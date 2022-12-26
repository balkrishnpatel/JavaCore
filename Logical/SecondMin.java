package Logical;

public class SecondMin {

	public static void main(String[] args) {
		int num[] = { 12, 56, 8, 56, 95, 86, 75, 10 };
		int firstlarge = num[0];
		int secondlarge = num[0];
		System.out.println("the give array is :: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			if (num[i] < firstlarge) {
				secondlarge=firstlarge;
				firstlarge=num[i];}
			else if (num[i]<secondlarge) {
					secondlarge=num[i];
				}
			
		}
		System.out.println("the second larget no is :: " + secondlarge);
	}

}
