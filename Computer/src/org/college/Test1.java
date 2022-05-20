package org.college;



public class Test1{
	
    private void test(Object... a) {
        for (int i = 0; i < a.length; i++) {
      	  System.out.println(a[i]);
  		
  	}
  		}
             public static void main(String[] args) {
				
			
      Test1 h = new Test1();
      h.test("ragu",20,23,44,33,55,66,67,54);
  		}
  }

