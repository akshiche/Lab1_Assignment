import java.util.Scanner;
public class Source{
	

	public static boolean checkNumber(int n){
	boolean result=false;

	int number=n%10;

	n=n/10;

	while(n>0)

	{

	if(number<n%10)

	{

	result=true;
	}

	result=false;

	number=n%10;

	n=n/10;
	}
	if(result==true)

	{

	return false;
	}

	else

	{

	return true;
}
	
}
	public static void main(String args[]){
		
Source src = new Source();

Scanner sc=new Scanner(System. in);

int n=sc.nextInt();

System.out.println(src.checkNumber(n));
}
	}