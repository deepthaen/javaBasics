package practis;

public class LargestValueInArray {
	//find the largest value from the given array.
	public static void main(String[] args) {
		 int[] arr={28,3,15,9,17,4,23,2};
		 largestArray(arr);
		 
	}

	private static void largestArray(int[] arr) {
		int len = arr.length;
		int temp;
		for (int i = 0; i < len; i++) {
			
			for (int j = i+1; j < len; j++) {
				
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				}
			System.out.println(arr[i]);
		//Yet ASK
		}
		
	}

}
