package com.testdemo;

public class TestPolymorphism {
	public int add(int x, int y) {
		return x + y;
	}
	
	public int add(int x, int y, int z) {
		return x+y+z;
	}
	
	public void method1() {
		System.out.println("invoking before method1 overriding");
	}

}

class Test2Polymorphism extends TestPolymorphism {
	public void method1() {
		System.out.println("calling after method1 ovverriding");
	}
}
