package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
private void vehicleNecessary() {
System.out.println("5000");
}

public static void main(String[] args) {
	TwoWheeler tw = new TwoWheeler();
	tw.bike();
	tw.cycle();
	ThreeWheeler th = new ThreeWheeler();
	th.auto();
	FourWheeler fo = new FourWheeler();
	fo.car();
	fo.bus();
	fo.lorry();
	Vehicle v = new Vehicle();
	v.vehicleNecessary();
}







}
