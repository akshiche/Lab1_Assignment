/**
 * Des  :returns the values of the map in the sorted order as a list 
 * Author:Akshitha
 */
package hashmap;

import java.util.*;

public class HashMapSorted {
	public static void main(String[] args) {
		HashMap <Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "Akshi");
		hashMap.put(2, "Swapna");
		hashMap.put(3, "Lakshmi");
		hashMap.put(4, "Sandhya");
		List<String> sortedHashMap=new ArrayList<String>();
		sortedHashMap=getValues(hashMap);
		System.out.println(sortedHashMap);
		
		
	}

	private static List<String> getValues(HashMap<Integer, String> hashMap) {
		
		List<String> sortedHashMap=new ArrayList<String>();
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {
			sortedHashMap.add(entry.getValue());
		}
		Collections.sort(sortedHashMap);
		
		return sortedHashMap;
	}

}