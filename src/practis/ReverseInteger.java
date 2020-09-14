package practis;

public class ReverseInteger {
	public static void main(String[] args) {
		int  i = 12345;
		reverseint(i);
		
	}

	private static void reverseint(int i) {
		
		
		int r = 0;
		while(i != 0) {
			int d = i%10;
			r = r*10+d;
			i = i/10;
		
		}
		System.out.println(r);
	}

}
