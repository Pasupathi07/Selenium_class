package week3.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class HomeWork2 {

	public static void main(String[] args) {
		String text = "paypal india";
		char[] charArray = text.toCharArray();
		/*HashSet<Character> set = new HashSet<Character>();
		for(Character unique:charArray) {
			if(unique ==' ')
				continue;
			set.add(unique);
		}
		System.out.println(set);*/
		ConcurrentHashMap<Character, Integer> map = new ConcurrentHashMap<Character, Integer>();
		for(Character unique:charArray) {
			if(unique ==' ')
				continue;
			if(map.containsKey(unique)) {
				map.put(unique, map.get(unique)+1);
			}else
			map.put(unique, 1);
		}
		for(Character unique1 : map.keySet()) {
			if(map.get(unique1)>1)
				map.remove(unique1);
		}
		System.out.println(map.keySet());
	}

}
