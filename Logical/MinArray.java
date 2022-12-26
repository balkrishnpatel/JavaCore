package Logical;

public class MinArray {
		public static void main(String[] args) {
			int num[] = {5,10,15,20,25,30,35};
			int maxvalues = num[0];
			for(int i =1;i<num.length;i++) {
				if(num[i]>maxvalues) {
					maxvalues= num[i];
				}
			}
			System.out.println("The Max values is :"+ maxvalues);
			int minvalues = num [0];
			for(int i = 1;i<num.length;i++) {
				if(num[i]<minvalues) {
					minvalues= num[i];
				}
			}
			System.out.println("The min value is :"+minvalues);
		
	}


}
