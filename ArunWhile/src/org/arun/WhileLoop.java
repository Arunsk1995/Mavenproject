package org.arun;
//counting digits
public class WhileLoop {
public static void main(String[] args) {
	     StringBuffer a = new StringBuffer("java");
	     long starttime = System.currentTimeMillis();
	     System.out.println(starttime);
	     for(int i =1; i<10000;i++) {
	    	 a.append("welcome");
	    	
	    	 
	     }
	     long endtime=System.currentTimeMillis();
	     System.out.println(endtime);
	     System.out.println(endtime-starttime);
}
	}
