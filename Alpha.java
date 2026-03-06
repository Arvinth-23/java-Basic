/* This Program is to convert the Specfic Charater into Number in which it present */
import java .util.Scanner;
public class Alpha{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet;");
        int ch = sc.next().charAt(0);
        int num = ch-'A'+1;
        System.out.println("Number value:"+num);
        sc.close();
    }
}