import java.lang.*;
import java.util.*;

class WorkAtTech
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        sc.nextLine(); 
        String name = sc.nextLine();
        
        int result = 2020 - year;
        
        System.out.println("Happy Birthday " + name + "! Your current age is " + result);
        
        sc.close();
    }
}