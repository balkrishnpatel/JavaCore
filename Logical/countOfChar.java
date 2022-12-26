package Logical;

public class countOfChar {
	public static void main(String[] args) {
		String str = "AbAabaluPatela";
		char ch = 'a';
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if(ch==str.charAt(i))
				count++;
		}
		System.out.println(count);
	}

}
