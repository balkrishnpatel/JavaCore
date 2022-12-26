package collection;


import java.util.ArrayList;
import java.util.List;

public class ListDublicateRemove {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(9);
		list.add(3);
		System.out.println(list);
		for (int i = 0; i<list.size(); i++) {
			for (int j = 1; j < list.size(); j++) {
				if (list.get(i)==list.get(j)) {
					list.remove(j);
				}
			}
		}
		System.out.println(list);
	}
}
