package com.pcts.sys;
class Test1 {
	 void m3(int f) {
		System.out.println("TEST1 "+f);
	}
	 void m3(double d) {
			System.out.println("Double "+d);
		}
}
public class Test extends Test1 {
	 int m3(float f) {
		System.out.println(f);
		return 999;
	}
	public static void main(String[] args) {
		Test T = new Test();
		T.m3(6.66);
		T.m3(6);
		T.m3(6.6f);
	}
}
