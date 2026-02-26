/* This Program get input from user and reverse the letters and output will be executed.    */

import java.util.Scanner;
public class Wordsplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String :");
        String input = sc.nextLine();
        String reversed = " ";
        for(int i= input.length()-1;i>=0;i--){
            reversed +=input.charAt(i);
        }
        System.out.println("Reversed String:"+reversed);
        sc.close();
    }
    
}