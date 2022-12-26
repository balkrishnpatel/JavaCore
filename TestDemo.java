
public class TestDemo {
	public static void main(String[] args) {
			String[] ch = {"a","b","c","a","c"};
			for (int i = 0; ++i <ch.length; ++i) {
				for (int j = i;  j<ch.length; ++j) {
					if (ch[i].compareTo(ch[j])==0) {
						System.out.print(ch[j]);
					}
				}
			}
	}

}