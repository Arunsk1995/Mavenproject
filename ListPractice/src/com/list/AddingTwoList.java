package com.list;

import java.util.ArrayList;
import java.util.List;

public class AddingTwoList {
	public static void main(String[] args) {
		
		
	    List li = new ArrayList <>();
	    
	    li.add(10);
	    li.add(10.6687f);
	    li.add("Java");
	    li.add('m');
	    li.add(true);
	    li.add(10);
	    List li1 = new ArrayList<>();
	    li1.add(false);
	    li1.add("selenium");
	    li1.add("Java");
	    li1.add('g');
	    li1.add(10.6678f);
	    li1.add(10);
	    //li.addAll(li1);
	   // System.out.println(li);
//	     li.retainAll(li1);
//	    System.out.println(li);
	    li1.removeAll(li);
	    System.out.println(li1);
	    
}
}