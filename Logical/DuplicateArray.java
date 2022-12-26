package Logical;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args) {
		int arr[]= {1,2,1,2,3,3,4,4,5,6,7};
		Set<Integer>set =new HashSet<Integer>();
		for (int i = 0; i<arr.length; i++) {
			if (set.add(arr[i])!=true) {
				System.out.print(arr[i]+",");
			}
			
		}
		
			
	}

}
