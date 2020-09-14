package practis;

public class Palindrom {

	public static void main(String[] args) {
		String s = "aba";
		String s1 = "abc";
		
		palindron(s);

	}

	private static void palindron(String s) {
      int len = s.length();
      String r = "";
      boolean flag = true;
      //char[] a = s.toCharArray();
      for (int i = 0, j = len-1; i <j; i++, j--) {
    	  
		if(s.charAt(i) != s.charAt(j)) {
			flag = false;
			break;
		}
	}
      if(flag) {
    	  	System.out.println("palindrom");

      }else {
    	  	System.out.println("Not palindrom");

      }
  	//System.out.println("Not palindrom");
	}

}
