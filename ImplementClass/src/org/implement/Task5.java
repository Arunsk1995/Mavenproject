package org.implement;

public class Task5 extends Task3 {

	@Override
	public void raguvaran() {
      System.out.println("He is a playboy");		
	}

	@Override
	public void arun() {
    System.out.println("He is a playgod");		
	}

	 public static void main(String[] args) {
		Task5 a = new Task5();
		a.arun();
		a.raguvaran();
		a.savings();
		a.fixed();
	}
	 
}