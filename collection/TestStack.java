package collection;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s=new Stack<>();
				s.add("merri");
				s.push(27);
				s.push(26);
				s.push(25);
				s.push(24);
				s.push(23);
				s.push(22);
				s.push(21);
				s.push(20);
				
				
				//s.pop();
				//s.peek();
				System.out.println(s);
				System.out.println(s.search(26));
				System.out.println(s.peek());
				System.out.println(s.pop());
				System.out.println(s);
	}

}
