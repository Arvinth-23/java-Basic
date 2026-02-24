/*.This Porgram in print the separated the number  */
import java.lang.*;
import java.util.*;

class WorkAtTech {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++) {   
            int m = sc.nextInt();
            int f = m / 10;
            int s = m % 10;
            
            System.out.println(f + " " + s); 
        }
        
        sc.close();
    }
}