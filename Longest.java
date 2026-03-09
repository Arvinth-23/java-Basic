/* In this program Its finds the Longest word in the Sentence */


import java.util.Scanner;
public class Longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence = sc.nextLine();
        String word[] = sentence.split(" ");
        String longest = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > longest.length()) {
                longest = word[i];
            }
        }
        System.out.println("Longest Word is : " + longest);
        sc.close();
    }
}