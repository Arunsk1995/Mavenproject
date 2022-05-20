package org.control;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String3 {
	public static void main(String[] args) {
		String s = "auomatiotntesterst";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				int integer = map.get(c);
				map.put(c, integer + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		char keyValue = ' ';
		int maximum = 0;
		Set<Entry<Character, Integer>> entryset = map.entrySet();
		for (Entry<Character, Integer> entry : entryset) {
			Integer value = entry.getValue();

			if (value > maximum) {
				maximum = entry.getValue();
				keyValue = entry.getKey();

			}
		}
		System.out.println("key is " + keyValue);
	}
}
