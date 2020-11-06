/**
 * Desc   :decide if they are eligible to vote
 * Author: Akshitha
 */
package hashmap;

import java.util.*;

public class VoterList {
	public static void main(String[] args) {
		Map<Integer,Integer> voterList=new HashMap<Integer,Integer>();
		voterList.put(101, 13);
		voterList.put(102, 65);
		voterList.put(103, 76);
		voterList.put(104, 22);
		List<Integer>voterDetails=votersList(voterList);
		System.out.println(voterDetails);
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterList) {
		List<Integer> voterDetails=new ArrayList<>();
		for(Map.Entry<Integer, Integer>entry: voterList.entrySet()) {
			if(entry.getValue()>18) {
				voterDetails.add(entry.getKey());
			}
		}
		return voterDetails;
	}

}