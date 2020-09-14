
public class DuplicateCharacterInString { 	
	public static void main(String[] args) {
		String s = "get bad"; // no duplicate car
		String b = "water heater"; // a t e r
		isDuplicateChar(b);
		if (isDuplicateChar(b)) {
			System.out.println("Constains duplicates");
		} else {
			System.out.println(" Dose not Constains duplicates");
		}
	}

	private static boolean isDuplicateChar(String f) {

		char[] c = f.toCharArray();
		
		for (int i = 0; i < c.length - 1; i++) {

			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j]) {
					return true;

				}

			}

		}
		return false;  
}
}