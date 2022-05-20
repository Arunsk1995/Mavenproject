package org.javascript;



public class Array {
           private void test(int... a) {
      for (int i = 0; i < a.length; i++) {
    	  System.out.println(a[i]);
		
	}
		}
           private void Main() {
    Array h = new Array();
    h.test(20,23,44,33,55,66,67,54);
		}
}
