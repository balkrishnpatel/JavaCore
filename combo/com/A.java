package combo.com;

 class A {
	final void methodM1() {
		System.out.println("hello im method m1 from combo.com.........");
	}

	final int i = 100;
	final int j = 200;

	final void m1() {
		final int k = 300;
		System.out.println(i + j + k);
	}

	final void m2() {
		 final int l = 400;
		System.out.println("hello..............." + l);
	}

	
}
