package Logical;

public class SecondLargNo {
	
	public static void main(String[] args) {
		int arr[]= {7,8,9,5,1,2,3,6,7,9};
		int f=arr[0];
		int s=arr[0];
		int t=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<f) {
				t=s;
				s=f;
				f=arr[i];
				
			}
			else if (arr[i]<s) {
				
				s=arr[i];
				
			}
			else if (arr[i]<t) {
				t=arr[i];
			}
			
		}
		System.out.println(f+" "+s+" "+t);
	}

}
