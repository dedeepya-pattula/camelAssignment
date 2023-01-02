package JavaProblems;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String reverseString = " ";
		
		System.out.println("Enter string: ");
		
		String str = sc.nextLine();
		
		
						
		int StringLength = str.length();
				
		for(int i = (StringLength-1); i >= 0 ; --i) {
			
			reverseString += str.charAt(i);
			
		}
		
		System.out.println(reverseString);
		
	}

}
