import java.util.ArrayList;
import java.util.List;

public class StringsRelated {

	public static void main(String[] args) {
		String s = "get bad"; // no duplicate car
		String b = "water heater"; // a t e r
		isDuplicateChar(s);
		if (isDuplicateChar(s)) {
			System.out.println("Constains duplicates");
		} else {
			System.out.println(" Dose not Constains duplicates");
		}
	}

	private static boolean isDuplicateChar(String f) {

		char[] c = f.toCharArray();

		// mehod - 1 without extra space

		// boolean flag = false;

		// c = ['g','e','t,' ','b','a','d']

		/*
		 * for (int i = 0; i < c.length - 1; i++) {
		 * 
		 * for (int j = i + 1; j < c.length; j++) {
		 * 
		 * if (c[i] == c[j]) { flag = true; break; } }
		 * 
		 * if (flag) { break; } //xvv }
		 * 
		 * if (flag) { System.out.println("Constains duplicates"); } else {
		 * System.out.println("Dose not Constains duplicates");
		 * 
		 * }
		 */

		// without extra space n2

		for (int i = 0; i < c.length - 1; i++) {

			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j]) {
					return true;

				}

			}

		}
		return false;

		/*
		 * List<Character> charList = new ArrayList<Character>(); // c = ['g','e','t,'
		 * ','e','a','d'] // charList = ['g','e']
		 * 
		 * for(int i = 0 ;i < c.length;i++) {
		 * 
		 * if(!charList.contains(c[i])) { System.out.println("no duplicates"+c[i]);
		 * charList.add(c[i]); //System.out.println("Duplicates"); //return true; }else
		 * { //charList.add(c[i]); System.out.println("duplicates");
		 * 
		 * } } System.out.println("no duplicates"); //return false;
		 */
	}

}
