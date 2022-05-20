package org.control;

public class Pattern4 {
                        public static void main(String[] args) {
							for (int i = 1; i <=10; i++) {
								for(int j=1;j<=i;j++) {
									if(j==i) {
										System.out.print(j);
									}else {
										System.out.print(" ");
									}
								}
								System.out.println();
							}
						}
}
