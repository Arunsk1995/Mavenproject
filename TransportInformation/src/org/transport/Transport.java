package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
private void transportForm() {
 System.out.println("676");
}
public static void main(String[] args) {
	Air a = new Air();
	a.aeroplane();
	Road r = new Road();
	r.bike();
	r.bus();
	r.car();
	r.cycle();
	Water w = new Water();
	w.boat();w.ship();
	Transport t = new Transport();
	t.transportForm();
	

}
}
