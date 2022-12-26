package test1;

import java.util.ArrayList;
class DemoTest
{
    public static void main(String args[])
    {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.forEach(s-> System.out.println(s));
        arrL.forEach(p-> {if(p%2==0)System.out.println(p);});
    }
}