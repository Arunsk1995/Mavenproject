package org.hybrid;

public class Son implements Test1 , Test2 {

	@Override
	public void interest() {
          System.out.println("5%");		
	}

	@Override
	public void totalloan() {
     System.out.println("6lakhs");		
	}

	@Override
	public void savings() {
     System.out.println("1 Lakh");		
	}

	@Override
	public void fixed() {
     System.out.println("2 Lakh");		
	}
public static void main(String[] args) {
	Son s = new Son();
	s.fixed();
	s.savings();
	s.interest();
	s.totalloan();
	}
}
