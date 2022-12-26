package Logical;
public class Fibonacciserice {
	public static void main(String[] args) {
		/*int a=0,b=1;
		System.out.print(a+" "+b+" ");
		for (int i = 0; i <= 5; i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}*/
		for(int i = 1; i<=5; i++) {
			int no =i;
			for (int j = 1; j<=i; j++) {
				System.out.print(no+" ");
				no = no+5-j;
			}
			System.out.println();
		}
		for(int i = 4; i>=1; i--) {
			int nn = i;
			for (int j = 1; j <=i; j++) {
				System.out.print(nn+" ");
				nn = nn+5-j;
			}
			System.out.println(" ");
		}
	}
}
