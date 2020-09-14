package practis;

import java.util.HashMap;
import java.util.Map.Entry;

// https://www.devlabsalliance.com/top-20-java-programming-interview-questions-for-sdet

public class ProgramOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcbbcd";
		// a - 1 b - 2 , c- 2 d- 1
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		for(int i = 0; i < a.length();i++) {
			
		char b = a.charAt(i);
		if(map.containsKey(b)) {
			int count = map.get(b)+1;
			map.put(b, count);
		}else {
			map.put(b, 1);
		}
	
		
		}
// System.out.println(map);
		// will cont tom..
		int fhig = 0,shig = -1;
		for (Entry<Character, Integer> c: map.entrySet()) {
			System.out.println("key : "+c.getKey()+" value : "+c.getValue());
			fhig = c.getValue();
			
		}			
	}
	

}
