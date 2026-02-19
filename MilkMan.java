/*Your mother has sent you to the milkman with a cylindrical bottle. You have to pay the milkman the price for the bottle full of milk at a rate of ₹40 per litre of milk. 
You are given the radius (r) and the height (h) of the bottle in centimetres. 
You can assume the value of π as 3.14.

*/
import java.lang.*;
import java.util.*;
class WorkAtTech
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		double h=sc.nextDouble();
		double vol=(r*r*h*3.14)/1000;
		double amount=vol*40;
		System.out.println(amount);
		sc.close();
		
	}
}