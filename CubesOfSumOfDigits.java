/**
 * Des   :Finding Cubes Of Sum Of Digits
 * Author:Akshitha
 */

public class CubesOfSumOfDigits {
	static int sum=0,Digit;
	
	public static void main(String args[]){
		int number=123;
		CubeSum(number);
		System.out.println("The sum of cubes of digits of the given number is " +sum);

	}
		private static int CubeSum(int number) {
		while(number>0)
		{
		 Digit= number%10;
		sum=sum+Digit*Digit*Digit;
		number=number/10;
		}
return sum;
	}
}
