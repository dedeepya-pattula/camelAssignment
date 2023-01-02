package JavaProblems;

import java.util.*;

public class IndicesTarget {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<Integer,Integer> mp = new HashMap<>();
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Integer[] arr = new Integer[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
			if(!mp.containsKey(arr[i]))
				mp.put(arr[i], i);
		}
		
		sc.nextLine();
		int target = sc.nextInt();
		
		for(int i = 0;i < n;i++) {
			if(mp.containsKey(target - arr[i]) && mp.get(target - arr[i]) < i) {
				System.out.println(mp.get(target - arr[i]) + " " + i + " ");
				//mp.put(arr[mp.get(target - arr[i])],-1);
			}
		}
		
	}

}
