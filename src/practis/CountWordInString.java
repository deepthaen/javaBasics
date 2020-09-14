package practis;

import java.util.HashMap;

public class CountWordInString {
	
	// Java program to count the number of words in a string using HashMap.
	public static void main(String[] args) {
		String s = "Training Training course and certification course in Devlabs Alliance";
		countWords(s);
	}

	private static void countWords(String s) {
		String[] a = s.split(" ");
		int len = a.length;
		String res = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < len; i++) {
			String k = a[i];
			if(map.containsKey(k)) {
				int val = map.get(k)+1;
				map.put(k, val);
				
			}else {
				map.put(k, 1);
				
			}
			
		}
		System.out.println(map);
	}

}
