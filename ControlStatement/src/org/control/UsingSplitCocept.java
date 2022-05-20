package org.control;

public class UsingSplitCocept {
                public static void main(String[] args) {
					String s= "Java programme";
					String[] split = s.split(" ");
					String Output="";
                    	for (String string : split) {
							for (int i = string.length()-1; i>=0; i--) {
								char charAt = string.charAt(i);
								Output=Output+charAt;
							}
							
							
							Output=Output+" ";
						}	
                    	System.out.println(Output);
					
				}
}
