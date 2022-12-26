import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WhileLoop {
	  
	public static void main(String[] args) 
    { 
     List<String> list = new LinkedList<String>(); 
  
        list.add("A"); 
        list.add("B"); 
        list.add("C"); 
        list.add("D"); 
        list.add("E"); 
        Iterator<String> iter = list.iterator(); 
  
         
        System.out.println("Displaying list elements in forward direction : "); 
  
        while (iter.hasNext()); 
            System.out.println(iter.next() + " "); 
        
        System.out.println("123"); 
        System.out.println("12"+ "");
    }
}

