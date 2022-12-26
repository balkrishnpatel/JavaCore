package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Test_Iterator {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList();
		//ArrayList<Integer> al= new ArrayList();
		//Vector<Integer> al= new Vector<>();
		
		al.add(13);
		al.add(13);
		al.add(13);
		al.set(2, 57);
		al.remove(1);
		al.add(7);
		al.addFirst(2);
		al.add(4, 4);
		al.add(36);
		//al.add("sari");
		Iterator irt = al.iterator();
		while (irt.hasNext()) {
			
			System.out.println(irt.next());
		}
			

		}
		
		
	
}
