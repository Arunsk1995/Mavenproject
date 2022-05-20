package org.college;

public class Encapsulation2 {
             public static void main(String[] args) {
				Encapsulation h = new Encapsulation();
				h.setUsername("twitter");
				h.setPassword("twitter");
				String name = h.getUsername();
				System.out.println(name);
				String pass = h.getPassword();
				System.out.println(pass);
			}
}
