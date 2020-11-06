/**
 * Desc   :Counts the number of times each character present in the array
 * Author :Akshitha
 */
package hashmap;

import java.util.*;

public class CountCharacterArray {
	public static void main(String[] args) {
		char[] character= {'z','e','z','z','w','f','e'};
		Map<Character,Integer> charOccurence=countChars(character);
		System.out.println(charOccurence);
	}

	private static Map<Character, Integer> countChars(char[] character) {
		Map<Character,Integer> countChar=new HashMap<Character,Integer>();
		for(char ch:character) {
			if(countChar.containsKey(ch)) {
				countChar.put(ch,countChar.get(ch)+1);
			}
			else {
				countChar.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer> entry: countChar.entrySet()) {
			countChar.put(entry.getKey(),entry.getValue());
		}
		return countChar;
	}

}