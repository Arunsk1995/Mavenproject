package org.control;

public class AdditionOfEvenNumber {
            public static void main(String[] args) {
            	int f ,sum=0;
				for(int i=2;i<=90;i=i+2) {
					f=sum+i;
					sum=f;
				}
				System.out.println(sum);
			}
}
