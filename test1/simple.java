package test1;

import java.util.Arrays;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

class simple {

	public static void main(String[] args) {
		
		String s1= new String("Hello");
		String s6=new String("Ram");
		String s2= "Hello";
		String s3= s1;
		String s4= s3;
		String s5= s2;
		System.out.println(s5==s2);
		//System.out.println(s1==s4);
		System.out.println(s5.equals(s2));
		String s7=s5;
		String s8=s6;
		//System.out.println(s7==s3);
		//System.out.println(s8==s6);
		//System.out.println(s1==s3);
		//System.out.println(s7==s1);
		// x System.out.println(s7.equals(s1));
		//String s9 =new String("Hello");
		//System.out.println(s1==s9);
		//System.out.println(s1.equals(s9));
	}
	

	
	


}
