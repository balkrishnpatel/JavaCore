package Logical;
public class Prime {
	public static void main(String[] args) {
		int Temp;
		
		for ( int sum = 20; sum < 70; sum++) {
			boolean a = true;
			for (int i = 2; i <= sum / 2; i++) {
				Temp = sum % i;
				if (Temp == 0) {
					a = false;
					break;
				}
			}
			if (a)
				System.out.println(sum + " prime");
			else
				System.out.println(sum + " not prime");
		}
	}
}
