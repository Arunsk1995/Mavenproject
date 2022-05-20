package org.control;

public class PrimeNumber {
             static String  LogicalProgramm(int a) {
             int b=0;
             for (int i = 2; i <a; i++) {
				if(a%i==0) {
					b++;
					break;
					
				}
				
			}
             if(b==0) {
            	 return " prime Number";
            	 
             }
             return "Not a prime";
			
			}
             static int reverseNumber(int a) {
            	 int rev =0;
            	
            	 while(a>0) {
            		 int b=a/10;
            		 int c = a%10;
            		 rev=(rev*10)+c;
            		 a=b;
            	 }
            	 return rev;
          
			}
             static String palindrome (int a) {
            	 int rev =0;
             	 int temp=a;
            	 while(a>0) {
            		 int b=a/10;
            		 int c = a%10;
            		 rev=(rev*10)+c;
            		 a=b;
            	 }
            	 if(temp==rev) {
            		 return "Palindrome";
            		 
            	 }
            	 {
            		 return "Not a Palindrome";
            	 }
             }
            	 static int CountofNumbers (int a) {
            		 int count=0;
            		
            		 while(a>0) {
            			 int b=a/10;
            			 int c=a%10;
            			 
            			 a=b;
            			 count++;
            			 
            		 }
					return count;
            		 
            	 }
            	 static int SumOfDigits (int a) {
            		 int count=0;
            		int sum=0;
            		 while(a>0) {
            			 
            			 int c=a%10;
            			 int b=a/10;
            			 sum=sum+c;
            			 count++;
            			 a=b;
            		 }
					return sum;
            		 
            	 }
             
             public static void main(String[] args) {
				String logicalProgramm = LogicalProgramm(31);
				System.out.println(logicalProgramm);
				int reverseNumber = reverseNumber(122334567);
				System.out.println(reverseNumber);
				String palindrome = palindrome(12344321);
				System.out.println(palindrome);
				int sumOfDigits = CountofNumbers(13245);
				System.out.println(sumOfDigits);
				int sumOfDigits2 = SumOfDigits(123456);
				System.out.println(sumOfDigits2);
			}
}
