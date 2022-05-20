package org.control;

public class StringPalindrome {
                 public static void main(String[] args) {
					String s= "madam";
				String output="";
					for(int i=s.length()-1;i>=0;i--) {
						char charAt = s.charAt(i);
				output=output+charAt;
					}
					System.out.println(output);
					if(s.equals(output)){
						System.out.println("String is palindrome");
					}else {
						System.out.println("String is not a Palindrome");
					}
				
					
				}
}
