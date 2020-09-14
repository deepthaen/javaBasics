package practis;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterInStrinh {
	// java program to find the duplicate characters in a string.
	public static void main(String[] args) {
		String s = "managament";
		duplicatechar(s);
	}

	private static void duplicatechar(String s) {
		int len = s.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				int val = map.get(c)+1;
				map.put(c, val);
				
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		Set<Character> set = map.keySet();
		for (Character entry : set) {
			if(map.get(entry) == 1 ) {
				System.out.println(entry);
				
			}
			
		}
		
		
	}

}
