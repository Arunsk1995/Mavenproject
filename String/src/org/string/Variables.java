package org.string;

public class Variables {
	 int c;

	private void test() {
		int a = 0;
		System.out.println(a);
		
	}

	private void hi() {
		int a = 10;
		System.out.println(a);
	
		

	}

	public static void main(String[] args) {

		Variables b = new Variables();
		System.out.println(b.c);
		
		Variables b1 = new Variables();
	
		b1.c=30;
		Variables b2= new Variables();
		System.out.println(b.c);
		

		


	}

}
