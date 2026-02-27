/* This program is bascics for Printing String and Integer Together */
import java.lang.*;
import java.util.*;

public class Str
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();   
        int age = sc.nextInt();    
        
        System.out.println("Hello " + name + "! Next year, you will be " + (age + 1) + " years old");
    }
}