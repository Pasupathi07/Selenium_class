package week3.day2;

import java.util.HashMap;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		String name = "pasupathi";
		char[] c = name.toCharArray();
		HashMap<Character, Integer> txt = new HashMap<Character, Integer>();
		for (char map : c) {
			if(txt.containsKey(map)) {
				txt.put(map, txt.get(map)+1);
			}else {
				txt.put(map, 1);
			}
		}
		for(Entry<Character, Integer> order:txt.entrySet()) {
			System.out.println(order);
		}
		}

	}

