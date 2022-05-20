package org.set.library;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample1 {
           public static void main(String[] args) {
			LinkedHashSet d = new LinkedHashSet<>();
			d.add(20);
			d.add(70);
			d.add("Java");
			d.add('F');
			d.add(true);
			d.add(false);
			
			for (Object object : d) {
				System.out.println(object);
			}
			}
			
			
		}

