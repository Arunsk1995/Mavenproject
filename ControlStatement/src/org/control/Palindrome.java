package org.control;

public class Palindrome {
          public static void main(String[] args) {
			int num=123321;
			int temp=num;
			int rev=0;
			while(num>0){
			int	n=num%10;
			rev=(rev*10)+n;
			num/=10;
			}
			if(rev==temp){
				System.out.println("palindrome");
			}else {
				System.out.println("not a palindrome");
			}
			
		}
}
