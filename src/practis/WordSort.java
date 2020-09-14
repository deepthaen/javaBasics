package practis;

public class WordSort {

	public static void main(String[] args) {
		stirngSortingExample();
		integerSorting();

	}

	private static void integerSorting() {
		// TODO Auto-generated method stub
		
		int[] a = { 44,6,77,3,4};
		int len = a.length;
		for (int i = 0; i < len-1; ++i) {
			for (int j = i + 1; j < len; ++j) {
				if (a[i]>a[j]) {
					// swap words[i] with words[j]
					int  temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("In lexicographical order:");
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]);
		}

		
	}

	private static void stirngSortingExample() {
		// TODO Auto-generated method stub
		String[] a = { "Ruby", "C", "Python", "Java" };
		for (int i = 0; i < 3; ++i) {
			for (int j = i + 1; j < 4; ++j) {
				if (a[i].compareTo(a[j]) > 0) {
					// swap words[i] with words[j]
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("In lexicographical order:");
		for (int i = 0; i < 4; i++) {
			System.out.println(a[i]);
		}

	}

}
