package practis;

import java.util.HashMap;

public class FreqOfCharacters {
	
	public static void main(String[] args) {
		String s = "DevLabs Alliance is awesome";
		System.out.println(frequencyCharacter(s,'h'));
	}

	private static int frequencyCharacter(String s, char c) {
		//String[] a = s.split(" ");//??
		char[] carr = s.toCharArray();
		int len = carr.length;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			//char[] d = s.toCharArray();
			if(map.containsKey(carr[i])) {
				int count = map.get(carr[i])+1;
				map.put(carr[i], count);
			}else {
				
				map.put(carr[i], 1);
			}
			
		}
		//D 1, e 4, v 1, L 4,
		//System.out.println(map);
		
		// return map.get(c);
		if(map.get(c) == null) {
			return 0;
		}
		
		return map.get(c);
	}

}
