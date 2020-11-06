/**
 * Des  :returns the numbers and their squares in hashmap
 * Author :Akshitha
 */
package hashmap;

import java.util.*;

public class SquareNumber {
	public static void main(String[] args) {
		int sqNum[]= {8,2,4,1,7,9};
		Map<Integer,Integer> squareNum=getSquares(sqNum);
		System.out.println(squareNum);
		
	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {
		
		Map<Integer,Integer> squareMap=new HashMap<>();
		for(int square:sqNum) {
			squareMap.put(square,square*square);
		}
		return squareMap;
	}

}