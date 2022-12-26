package com.bk.patel;

class Test {
	private static Test t = null;

	private Test() {
	}

	public static Test getTest()
	// getTest() method is a factory method
	{
		if (t == null) {
			t = new Test();
		}
		return t;
	}
}

class TestDemo  {
	public static void main(String[] args) {
		System.out.println(Test.getTest().hashCode());// 1671711
		System.out.println(Test.getTest().hashCode());// 1671711
		System.out.println(Test.getTest().hashCode());// 1671711
		System.out.println(Test.getTest().hashCode());// 1671711
	}
}
