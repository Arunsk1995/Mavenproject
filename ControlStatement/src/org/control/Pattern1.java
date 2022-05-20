package org.control;

public class Pattern1 {
	static int f,i,j,k;
	public static void main(String[] args) {
		f=0;
		 for (i=1;i<=4;i++) {
			 
			 for( j=1;j<=i+1;j++) {
				 System.out.print(" ");
			 }
			 f=f+2;
			 
			 for( k=9-f;k>=1;k--) {
				 System.out.print("*");
				
			 }
			 
			 System.out.println();
		 }
		
		
	}

}
