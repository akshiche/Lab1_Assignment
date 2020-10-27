/**
 * Desc  :TrafficLight 
 * Author:Akshitha
 */
import java.util.*;
public class TrafficLight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the colour");
		String Choice=sc.nextLine();
		if(Choice=="red")
		{
		 System.out.println("stop");	
		}
	else if(Choice=="yellow")
		{
			System.out.println("ready");
		}
		else
		{
			System.out.println("Go");
		}

	}

}