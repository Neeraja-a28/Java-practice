package com.testdemo;

// abstract class practice
public class Animal extends Dog{
	
	public static void main(String[] args){
		  System.out.println("main method ....");
		  
		  Dog d = new Animal();
		  d.freek();
		  d.sound();
		}
	
	public void sound() {
		System.out.println("calling animal sound method");
	}

}

abstract class Dog {
	abstract public void sound();
	
	public void freek() {
		System.out.println("dog was freeking");
	}
}