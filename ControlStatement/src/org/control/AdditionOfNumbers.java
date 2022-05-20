package org.control;

public class AdditionOfNumbers {

	
                          public static void main(String[] args) {
                        	  int d,sum=0;
							for(int i=1;i<=80;i=i+2) {
								
								d=sum+i;
								sum=d;
							}
							System.out.println(sum);
						}
}
