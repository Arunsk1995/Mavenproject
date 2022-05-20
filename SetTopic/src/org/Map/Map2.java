package org.Map;

import java.awt.RenderingHints.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map2 {
                 public static void main(String[] args) {
					Map<Integer, String> mp = new HashMap<>();
					mp.put(1, "Java");
					mp.put(2, "Arun");
					mp.put(3, "ragu");
					mp.put(4, "raja");
					System.out.println(mp);
					
					Set<Integer> keySet = mp.keySet();
					System.out.println(keySet);
					Collection<String> values = mp.values();
					System.out.println(values);
					boolean containsKey = mp.containsKey(5);
					System.out.println(containsKey);
					String string = mp.get(3);
					System.out.println(string);
					Set<Entry<Integer, String>> entrySet = mp.entrySet();
					for (Entry<Integer, String>entry : entrySet) {
						
					    System.out.println(entry.getKey());
					    System.out.println(entry.getValue());
						
					}
				
					
					
				}
}
