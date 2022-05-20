package org.control;

public class StringVowel {
	public static void main(String[] args) {
		
	
                    String s= "Arunsk";
                    int vowelCount=0;
                    String output="";
                    for (int i = 0; i< s.length()-1; i++) {
						
					
                    char c = s.charAt(i);
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A') {
                    	vowelCount++;
                    	output=output+c;
                    }
                    }
                    System.out.println(output);
                    System.out.println(vowelCount);
}
}