
	import java.util.regex.*;
	import java.util.Scanner;
	public class different {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	different src=new different();
	int s=sc.nextInt();
	System.out.println(src.calculateDifference(s));

	}
	public int calculateDifference(int n)
	{
	int Squaresum=0;
	int Naturalsum=0;
	for(int i=1;i<=n;i++)
	{
	Squaresum+=i*i;
	Naturalsum+=i;

	}
	int sum=0;
	sum=Squaresum-(Naturalsum*Naturalsum);
	return sum;
	}
	}
