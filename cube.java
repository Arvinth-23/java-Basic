/* This program is used for calculating the Surface Area and Volume of the cube   */

import java.lang.*;
import java.util.*;

class cube
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int s = 6 * a * a;
		int v = a * a * a;
		System.out.println(s+" "+v);
	}
}