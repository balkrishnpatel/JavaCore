package string;

public class InternUse {
	public static void main(String[] args) {
		String s1 = new String("Krishna");
		String s2 = "Krishna";
		String s3 = s1.intern();
		System.out.println(s3==s1);
		System.out.println(s2==s3);
		System.out.println(s2==s1);
		System.out.println(s1);
		System.out.println(s2);
	}

}
