package Logical;

import java.util.Scanner;

public class ReversNo {
	public static void main(String[] args) {
		int b,sum=0,temp;
		int a = 456; 
		while(a!=0) {
			b=a%10;
			sum=sum*10+b;
			a=a/10;
		}System.out.println(sum);
	}

}
