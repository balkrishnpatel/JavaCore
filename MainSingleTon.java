
class Singleton 
{  
    private static Singleton single=null; 
    public String s; 
    private Singleton() {  
    	s = "Hello I am a string part of Singleton class"; 
    }
   
     public static Singleton Singleton() 
    {   if (single == null) 
        { 
            single = new Singleton(); 
        } 
        return single; 
    } 
    
} 
  
 
class MainSingleTon 
{ 
    public static void main(String args[]) 
    {  
        Singleton x = Singleton.Singleton(); 
        Singleton y = Singleton.Singleton(); 
        Singleton z = Singleton.Singleton(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
          
       
    } 
} 