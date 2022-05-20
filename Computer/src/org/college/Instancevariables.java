package org.college;

public class Instancevariables  {
	int b;
                 private void test() {
                	 int b=100;
            	 
                	 System.out.println(b);//100
                	 
				}
                 private void test1() {
                	 int b=100;
                     System.out.println(b);
				}   
                 
                 public static void main(String[] args) {
					Instancevariables g = new Instancevariables();
					g.test();
					g.test1();
					Instancevariables h = new Instancevariables();
					h.test1();
					h.test();
				}
}
