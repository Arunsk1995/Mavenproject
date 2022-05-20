package org.set;

public class Sample2 {
       public static void main(String[] args) {
		Sample1 d = new Sample1();
		d.setUsername("twitter");
		d.setPassword("facebook");
		String username = d.getUsername();
		System.out.println(username);
		String password = d.getPassword();
		System.out.println(password);
	}
       
}
