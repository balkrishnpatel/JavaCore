package Logical;

public class StringPalidrom {

	public static void main(String[] args) {
         String str="my name is prabhakr";
         String rev=" ";
         String arr[]=str.split("");
         for(int i=arr.length-1; i>=0; i--) {
        	 rev=rev+arr[i];
        	 
         }
         System.out.println(rev);
         System.out.println(arr.length);
         if(str.equals(rev)) {
        	 System.out.println("is a pa");
         }
        	 else 
        		 System.out.println("is a pa");
        	 
         }
}
	


