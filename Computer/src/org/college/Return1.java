package org.college;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Return1 {
                  private List<Integer> Listof() {
                	  List<Integer> i = new ArrayList<>();
                	  i.add(10);
                	  i.add(20);
                	  i.add(30);
                	  i.add(40);
                	  System.out.println(i);
                	  
					return i;
                  
				}
                  private List<Integer> set0f(List<Integer> t) {
                	  for (int i = 0; i <t.size(); i++) {
					System.out.println(t.get(i));
						
					}
                	  
					return t;
					}
                  
              public static void main(String[] args) {
				
				Return1 m = new Return1();
				List<Integer> n= m.Listof();
				m.set0f(n);
				
				
				
			}    
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
}



















