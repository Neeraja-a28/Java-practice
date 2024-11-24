package com.testdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestCollection {

	public static void main(String[] args) {
      System.out.println("calling first block");
      
      ArrayList list =new ArrayList();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(10);
      list.add(null);
      list.add(2);
      
      // System.out.println("Array list values : " +list);
      /* Iterator<Object> itr = list.iterator();
      //while(itr.hasNext()) {
    	  //System.out.println(itr.next());
      } */
      
      LinkedList list1 = new LinkedList();
      list1.add(10);
      list1.add("neeraja");
      list1.add(null);
      list1.add(50);
      list1.add(10);
      
     // System.out.println("Linked List values : "+ list1);
      
     HashSet<Object> set = new HashSet<>();
     set.add(10);
     set.add("name");
     set.add(20);
     set.add(null);
     set.add(10);
     set.add(30);
     
     
     //System.out.println("HashSet values : "+ set);
     
     /* Iterator it = set.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     } */

     LinkedHashSet ls = new LinkedHashSet();
     ls.add("neeraja");
     ls.add(true);
     ls.add(10);
     ls.add(20);
     ls.add(10);
     ls.add(null);
     
     System.out.println(ls);
     
	}

}
