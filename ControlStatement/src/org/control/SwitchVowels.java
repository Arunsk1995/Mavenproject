package org.control;

public class SwitchVowels {
                    public static void main(String[] args) {
						String s="Arunsk";
						int count=0;
						for (int i = 0; i <s.length(); i++) {
							char c = s.charAt(i);
							switch (c) {
							case 'a':
								 System.out.print(c);
								 count++;
								break;
                             case 'e':
								System.out.print(c);
								count++;
								break;
                             case 'i':
	                           System.out.print(c);
	                           count++;
	                          break; 
                             case 'A':
                            	 System.out.print(c);
                            	 count++;
                            	 break;
                             case 'u':
                            	 System.out.print(c);
                            	 count++;
                            	 break;
	                          
							default:
								break;
								
							}
						}
						System.out.println();
						System.out.println(count);
					}
}
