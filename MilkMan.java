/*Your mother has sent you to the milkman with a cylindrical bottle. You have to pay the milkman the price for the bottle full of milk at a rate of ₹40 per litre of milk. 
You are given the radius (r) and the height (h) of the bottle in centimetres. 
You can assume the value of π as 3.14.

*/
import java.lang.*;
import java.util.*;
class MilkMan
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double h = sc.nextInt();
		double volume = (r * r * h * 3.14)/1000;
		double a = volume * 40;
		System.out.println(+ a);
	}
}