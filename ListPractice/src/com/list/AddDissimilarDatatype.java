package com.list;

import java.util.ArrayList;
import java.util.List;

public class AddDissimilarDatatype {
	public static void main(String[] args) {
		
	
	    List li = new ArrayList <>();
	    
	    li.add(10);
	    li.add(10.6687f);
	    li.add("Java");
	    li.add('m');
	    li.add(true);
	    li.add(10);
	    int b = li.size();
	    
//	    System.out.println(li);
//	    li.set(3, 'h');
//	    System.out.println(li);
//	    int size = li.size();
//	    System.out.println(size);
//	    boolean empty = li.isEmpty();
//	    System.out.println(empty);
//    int indexOf = li.indexOf(10);
  //  System.out.println(indexOf);
//	    int lastIndexOf = li.lastIndexOf(10);
//	    System.out.println(lastIndexOf);
//	    int indexOf2 = li.indexOf("Java");
//	    System.out.println(indexOf2);
//	    Object object = li.get(3);
//	    System.out.println(object);
//	    li.remove(2);
//	    System.out.println(li);
	    
   for(int j = 0;j<=3;j++) {
   	System.out.println(li.get(j));
	    	
   }	
    System.out.println();
    for(int i=5;i>=2;i--) {
   	System.out.println(li.get(i));
    }
	    
    for (Object object : li) {
		System.out.println(object);
	}
   for(int k=0;k<=5;k=k+2) {
   	System.out.println(li.get(k));
   }
	    for(int l=0;l<=5;l++) {
	    	if(l%2==0) {
	    		System.out.println(li.get(l));
	    	}else {
	    		System.out.println();
	    	}
	    		
	    }
	    
	}

}
