/**
 * Des: sum of n numbers Div By 3 and 5 
 * Author:Akshitha
 */
import java.util.Scanner;
public class DivBy3and5 {
	static int sum=0;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	   	int x=sc.nextInt();
	   	System.out.println(CalculateSum(x));
	}
	   	public static int CalculateSum(int n)
	   	{
	   	for(int i=0;i<=n;i++)
	   	{
	   		if(i%3==0||i%5==0)
	   		{
	   			sum=sum+i;
	   		}
	   	}
	   	return sum;
	}

}


