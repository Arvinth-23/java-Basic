/*  This is the simple Temperature conversion program using for loop    */

import java.util.*;

class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   
        while (T-- > 0) {
            double t = sc.nextDouble();   
            double f = (9 * t / 5) + 32;  
            System.out.printf("%.2f\n", f);  
        }
        sc.close();
    }
}