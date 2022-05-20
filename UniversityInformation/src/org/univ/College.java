package org.univ;

public class College extends University {
                     
                    public void ug() {
                    	
                    	
                       super.ug();
                      System.out.println("Oxford University");   
                     
                    }
                  
                    public void pg() {
                    	
                    System.out.println("Massauettes Universty");
                   super.pg();
                   
                    }
                    public static void main(String[] args) {
						College a = new College();
						a.ug();
						
					}
}
