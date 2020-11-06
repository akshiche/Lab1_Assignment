/**
 * Desc   :reverse the number in the array and return the resulting array in the sorting order
 * Author :Akshitha
 */
package hashmap;

import java.util.*;
public class SortReverseNumber {
	public static void main(String[] args) {
		
		List<Integer> result=new ArrayList<>(Arrays.asList(32,58,85,98,12));
		List<Integer> reverse = getSorted(result);
		System.out.println("Sorted Reverse Array\n "+reverse);
	}
	
	private static List<Integer> getSorted(List<Integer> result) {
		List<Integer> reverseSorted=new ArrayList<Integer>(result);
		Collections.reverse(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 System.out.println("Reverse Sorted Array\n "+reverseSorted);
		 Collections.sort(reverseSorted);
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 return reverseSorted;
	}

	
	

}