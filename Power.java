/**
 * Des:Check if a number is power of two or not
 * Author:Akshitha
 */

import java.util.Scanner;
public class Power {
public static boolean checkNumber(int n)
{
while(n!=1)
{
if(n%2!=0)
{
return false;
}
n=n/2;
}
return true;
}
public static void main(String args[]) {
Power src=new Power();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(src.checkNumber(n));
}
}
