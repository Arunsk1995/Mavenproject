package org.control;

public class CountOfUpperCaseLowerCase {
	public static void main(String[] args) {
		
	
                       String s= "Arunsk199514@Gmail.com";
                       int capsCount=0;String caps="";
                       int smallCount=0;String small="";
                       int numberCount=0;String num="";
                       int specialCount=0;String spec ="";
                       for (int i = 0; i < s.length(); i++) {
                    	   char c = s.charAt(i);
						if(c>='a'&&c<='z') {
							smallCount++;
							small=small+c;
						} 
						else if(c>='A'&&c<='Z') {
							capsCount++;
							caps=caps+c;
							}
						else if(c>='0'&&c<='9') {
							numberCount++;
							num=num+c;
						}else {
							specialCount++;
							spec=spec+c;
						}
					}
                       System.out.println(capsCount);
                       System.out.println(smallCount );
                       System.out.println(numberCount);
                       System.out.println(specialCount);
                       System.out.println(small);
                       System.out.println(caps);
                       System.out.println(num);
                       System.out.println(spec);
}
	



}
