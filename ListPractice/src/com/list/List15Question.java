package com.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List15Question {
	public static void main(String[] args) {

		List li = new ArrayList<>();

		li.add(10);
		li.add(10.6687f);
		li.add("Java");
		li.add('m');
		li.add(true);
		li.add(10);
		li.add(20);
		// First index value
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		System.out.println();
		// Last index value
		int indexOf2 = li.indexOf(true);
		System.out.println(indexOf2);
		System.out.println();
		// length of List
		int b = li.size();
		System.out.println(b);
		System.out.println();
		// To get first 4 index value
		for (int j = 0; j <= 3; j++) {
			System.out.println(li.get(j));
        }
		System.out.println();
		// To get Last 4 index value
		for (int i = 5; i >= 2; i--) {
			System.out.println(li.get(i));
		}
		System.out.println();
		// Enhanced for loop iteration

		for (Object object : li) {
			System.out.println(object);
		}
		System.out.println();
		// To get Alternative index value

		for (int k = 0; k <= 5; k = k + 2) {
			System.out.println(li.get(k));
		}
		System.out.println();
		// To get Alternative index value
		for (int l = 0; l <= 5; l++) {
			if (l % 2 == 0) {
				System.out.println(li.get(l));
			} else {

			}
		}
		System.out.println();
		// For Loop iteration
		for (int h = 0; h <= 4; h++) {
			System.out.println(li.get(h));
		}
		System.out.println();
		// to get middle index value
		int g = li.size() / 2;
		Object object = li.get(g);
		System.out.println(object);
		
		System.out.println();
		Set f = new LinkedHashSet<>();
		f.add(20);
		f.add("Java Programm");
		f.add('R');
		f.add(78.99f);
		f.add(7402345219l);
		f.add(true);
//		 f.addAll(li);
//		 System.out.println(f);
		li.addAll(f);
		System.out.println(li);

	}
}