
public class Test {
	// premitive types
	int i = 0;
	double j = 9d;
	float k = 4f;
	long l = 1l;

	// class type
	static Integer a = 2;
	Integer b = new Integer(9);

	// Java supports Auto casting primitive class to class type and vise versa

	// static methods can access only static variable of the class
	// NON static methods can access both static and non satic variables of the
	// class

	public static void main(String[] args) {
		int g = 2;
		double f = 3.4;
		int j = (int) f;
		double e = (int) g;
		// int u = (double)f; casting NOT Possible

		Integer t = 0;
		t = g;
		String s = "deeptha";
		name(s);

		String o = "deeptha";
		g = stringlen(o);
		System.out.println(g);

		String r = "mysore";// 'D' , 'e'. ..

		char[] c = getChatArray(r);
		// for (int i = 0; i < c.length; i++) {
		// System.out.println(c[i]);
		// }
		// c[0]

		for (char d : c) {
			System.out.println(d);// d = c[2]

		}

		/*
		 * int[] hh = new int[2]; hh[0] = 1; hh[1] = 3; for (int i = 0; i < hh.length;
		 * i++) { System.out.println(hh[i]); }
		 */
		
		// String : lenth, trim , tocharArr, chatAt(8),compreTo
		// list : add , remove , get() , constains , lenth
		// Set : add , remove , get() , constains , lenth
		// map : put , get , constainskey, size
		// stack : pop , push , isempty, lentth
		// queue
		
	}

	private static char[] getChatArray(String p) {
		return p.toCharArray();
	}

	private void fun() {
		int g = i + 2;

	}

	private static void name(String d) {
		System.out.println(d);

	}

	public static int stringlen(String t) {
		int len = t.length();
		return len;

	}

}

class B {
	
	private void fun() {
		Test.stringlen("dd");
	}
}

// 1. Everything in java is refered as object
// 2. Class - Can have either variables / methods ( these are called class properties)
// Class properties can only be accessed using its object

// All the static property can be accesable from class name

// private properties can only be accessable within class
// public properties can be accessable out side the class
// Default properties can only be accessed within the package
// Protected propeties can only be accesable within its child class
