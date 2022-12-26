package string;

public class Testing {
	public static void main(String args[]) {
		int x[] = { 1, 2, 3, 5, 6, 4 };
		int max = x[0], smax = x[0];
		for (int i = 0; i < x.length; i++) {
			if (max > x[i]) {
				smax = max;
				max = x[i];
			} else if (smax < x[i]) {
				smax = x[i];
			}

		}
		System.out.println(smax);

	}
}