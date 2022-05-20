package com.list;
   
public class ArrayPractice {
	static int c,d,avg;
      public static void main(String[] args) {
		
	
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		for(int i =0;i<=9;i++) {
			
			c= a[i]+d;
			d=c;
		}
		System.out.println(c);
		avg=d/a.length;
		System.out.println(avg);
	
}
}