package collection;

import java.util.ArrayList;
import java.util.List;

public class FinalList {
	public static void main(String[] args) {
		final List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
	}

}
