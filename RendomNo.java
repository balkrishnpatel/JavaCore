import java.util.Random;

public class RendomNo { 
		  
	    public static void main(String args[]) 
	    { 
	        // create instance of Random class 
	        Random rand = new Random(); 
	        int a =rand.nextInt(10);
	        int b= rand.nextInt(10);
	        System.out.println(a+"\n"+b);
	        double c= rand.nextDouble();
	        System.out.println(c);
}
	    
}