/* You are having a get together at your house and your mother asks you to distribute candies equally amongst all your cousins. 
You want to determine if the number of candies given by your mother can be equally distributed or not.*/


import java.lang.*;
import java.util.Scanner;
class EqualDistribution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int candies = sc.nextInt();
		int cousins = sc.nextInt();
		if (candies%cousins == 0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}