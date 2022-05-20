package org.edu;

public class Arts extends Education  {
               public void bsc() {
               System.out.println("2016 passed out");
			}
               public void bEd() {
               System.out.println("2012 passed out ");
			}
               public void bA() {
            	  
               System.out.println("2013 passed out ");
               super.ug();
               super.pg();
			}
               public void bBA() {
            	   
               System.out.println("2014 passed out");
               
			}
            
            public void ug() {
            System.out.println("2020 passed out");
            }
            
            public void pg() {
              System.out.println("2021 passed out ");            }
            
            public static void main(String[] args) {
				Arts a = new Arts();
				a.bA();
				a.bBA();
				a.bEd();
				a.bsc();
				a.pg();
				a.ug();
			}
}
