import java.util.ArrayList;

public class Duplicateinteger {
	
	public static void main(String[] args) {
		int[] a = {2,7,3,4,2,8,0};
		// a = 0 , 2 ,2, 3, 4, 7, 8
		sortDuplicate(a);
	}

	private static void sortDuplicate(int[] a) {
		
		// Sort the array 
		int len = a.length;
		int temp;
		
		for (int i = 0; i < len-1; i++) {
			for (int j = i+1; j < len; j++) {
				
				if(a[i] < a[j]) {// a[i] == a[j]
				 	
					temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
				}
				
			}
			//System.out.println(a[i]);
			
		}
		
		for(int i = 0; i < len;i++) {
		//	System.out.println(a[i]);
		}
		
		// print the array
		ArrayList<Integer> lst = new ArrayList<Integer>();

		for (int i = 0; i < len; i++) {
			if(!lst.contains(a[i])) {
				System.out.println(a[i]);
				lst.add(a[i]);				
			}
			
		}
		
		
		
		
	}

}
