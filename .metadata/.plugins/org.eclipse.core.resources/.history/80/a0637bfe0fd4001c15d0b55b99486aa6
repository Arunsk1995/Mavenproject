package org.control;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringAccuranceWords {
public static void main(String[] args) {

    String s ="Java Selenium Training Phython Selenium Training ";
    String[] split = s.split(" ");
//    split = {Java, Selenium, Training, Phython, Selenium, Training}
    Map <String,Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < split.length; i++) {
		String s1 = split [i];
		if (map.containsKey(s1)) {
			int a = map.get(s1); 
			map.put(s1, a+1);
		}else {
			map.put(s1, 1);
			
		}
	}
    System.out.println(map);
    
}
}

