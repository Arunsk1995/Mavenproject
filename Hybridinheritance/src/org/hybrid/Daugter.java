package org.hybrid;

public class Daugter implements Test1,Test2 {

	@Override
	public void interest() {
    System.out.println("7%");		
	}

	@Override
	public void totalloan() {
         System.out.println("9 Lakh");		
	}

	@Override
	public void savings() {
       System.out.println("2 Lakh");		
	}

	@Override
	public void fixed() {
      System.out.println("5 Lakh");		
	}
public static void main(String[] args) {
	Daugter d = new Daugter();
	d.savings();
	d.fixed();
	d.totalloan();
	d.interest();
}

}
