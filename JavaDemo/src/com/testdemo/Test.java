package com.testdemo;

public class Test extends Test2{
	public int a = 10;
	int b = 20;

	public static void main(String[] args) {
		System.out.println("hello world");
		Test t = new Test();
		t.method1();
	}
	
	public void method1() {
		System.out.println("calling method1");
		method2();
	}
	
	public int method2() {
		System.out.println(a + b);
		return a+b;
	}

}

