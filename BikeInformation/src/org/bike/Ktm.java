package org.bike;

public class Ktm  implements Bike{

	@Override
	public void cost() {
               System.out.println("5 lakh");	
               
	}
     
	@Override
	public void speed() {
		this.cost();
             System.out.println("150kmph");	
             
	}
public static void main(String[] args) {
	Ktm f = new Ktm();
	f.speed();
	
}
}
