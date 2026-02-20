/* You and your friend decide to play a game where given some numbers, you have to find the maximum number. 
If the maximum is an even number, you win and if it is odd, your friend wins.
 */
import java.lang.*;
import java.util.*;
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int max = 0;
		for(int i=0;i<N;i++){
			int Num=sc.nextInt();
			if(Num>max){
				max=Num;
			}
		}
		if (max%2 == 0){
			System.out.println("WON");
		}
		else{
			System.out.println("LOST");
		}
	}
}