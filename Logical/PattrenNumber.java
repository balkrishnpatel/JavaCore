package Logical;

public class PattrenNumber {
	public static void main(String[] args) {
		for (int i = 1; i<=17; i++) {
			int no = i;
			for (int j = 1; j<=i; j++) {
				System.out.print(no+" ");
				no = no-3;
				if (no<=0 || j==4) {
					break;
				}
			}
			i = i+3;
			System.out.println();
		}
		for (int i=18; i<=20; i++) {
			int nn = i;
			for (int j = 1; j <=i; j++) {
				System.out.print(nn+" ");
				nn = nn-3;
				if (nn<12 || nn==13 || nn==17) {
					break;	
				} 
			}
			System.out.println(" ");
		}
		
	}
}
