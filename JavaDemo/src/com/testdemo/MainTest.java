package com.testdemo;

public class MainTest {

	public static void main(String[] args) {
      System.out.println("calling Main Method .....");
      
      Person p = new Person();
      p.setName("Neeraja");
      p.setEmail("neeraja@gmail.com");
      p.setMobile(980098001);
      
      //System.out.println(p.getName());
      //System.out.println(p.getEmail());
      //System.out.println(p.mobile);
      
      TestPolymorphism t = new Test2Polymorphism();
        System.out.println( t.add(4, 5));
        System.out.println(t.add(3, 3, 7));
        
        t.method1();
	}

}