package JavaProblems;

import java.util.*;

public class RepeatingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Integer,Integer> mp = new HashMap<>();
	
		//List<Integer> arr = new ArrayList<>();
		
		
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
			
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i],1);
			}
			else {
				mp.put(arr[i], 0);
			}
			
		}
		
		 for (Map.Entry<Integer,Integer> entry : mp.entrySet()) {
			 	
			 if(entry.getValue() == 1) {
	            System.out.println("Key = " + entry.getKey());
			 }
		}


	}

}
