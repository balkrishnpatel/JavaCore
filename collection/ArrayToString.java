package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayToString {
	public static void main(String[] args) {
		ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(5);
		s.add(6);
		s.add(5);
		s.add(5);
		s.add(7);
		System.out.println(s);
		Iterator itr= s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set<Integer> set = new HashSet<Integer>(s);
		System.out.println(set);
		Iterator Itr1 = set.iterator();
				while (Itr1.hasNext()) {
					System.out.println(Itr1.next());
					
				} 
		
		
	}

}
