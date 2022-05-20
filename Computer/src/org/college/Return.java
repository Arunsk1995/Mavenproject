package org.college;

public class Return {
	private int m1(int a, int b) {

		System.out.println(a + b);
		return a + b;
	}

	private int m2(int a) {

		System.out.println(a * 2);
		return a * 2;
	}

	private int m3(int age) {
		if (age >= 18) {
			System.out.println("Eligible to Vote");
		} else {
			System.out.println("Not Eligible to Vote");
		}
		return age;
	}

	public static void main(String[] args) {
		Return f = new Return();

		int addition = f.m1(5, 4);

		int multi = f.m2(addition);
		f.m3(multi);

	}
}
