package org.string;

public class Palindrome {
	public static void main(String[] args) {
		String s = ("madam");
		String s1 = ("madam");
		
		int compareTo = s.compareTo(s1);
		System.out.println(compareTo);
		if (compareTo == 0) {
			System.out.println("Print the word is palindrome");
		} else {
			System.out.println(("Print the word is not a Palindrome"));
		}
	}
}
