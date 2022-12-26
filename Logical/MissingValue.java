package Logical;

public class MissingValue {

	public static void main(String[] args) {
		int rr[] = { 1, 2, 4, 6, 7, 9 };
		System.out.print("Missing array without array is : ");
		for (int i = 0; i < rr.length - 1; i++) {
			if (rr[i + 1] != rr[i] + 1) {
				System.out.print(rr[i] + 1 + " ");
			}
		}
	}
}
