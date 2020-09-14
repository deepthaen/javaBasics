package practis;

public class ReverseString {
	
	public static void main(String[] args) {
		String s = "bangaloreMysore";
		reversestring(s);
		
		
	}

	private static void reversestring(String s) {
		int len = s.length();
		String r = "";
		for (int i = len-1; i >=0; i--) {
			char c = s.charAt(i);
			//r = r+c;
			System.out.print(c);	
			
		}
		//System.out.print(r);
	}

}
