package practis;

import java.util.Stack;

public class ReverseOrderOfWord {

	public static void main(String[] args) {
		String s = "Shopx is worst company";
		// recerseword(s);

		recerseworUsingstack(s);

	}

	private static void recerseworUsingstack(String s) {

		Stack<String> st = new Stack<String>();
		String[] a = s.split(" ");

		for (String f : a) {
			st.push(f);
		}

		String output = "";

		while (!st.isEmpty()) {
			String tm = st.pop();
			output = output + tm + " ";
		}
		System.out.println(output.trim());

	}
// extra space coming at the end of word

	private static void recerseword(String s) {
		String[] a = s.split(" ");
		int len = a.length;
		String r = "";
		for (int i = len - 1; i >= 0; i--) {
			r = r + a[i] + " ";

		}
		System.out.println(r.trim());

	}

}
