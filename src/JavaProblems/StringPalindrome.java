package JavaProblems;

import java.util.*; 

public class StringPalindrome {

	public static void main(String[] args) {
		
		String revSt = "";

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String st =sc.nextLine();
		
		int stLength = st.length();
		
		for(int i = (stLength-1) ; i >=0 ; --i) {
			
			revSt = revSt + st.charAt(i);					
		}
		if(st.equals(revSt)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
