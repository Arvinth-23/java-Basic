import java.util.Scanner;

public class Strcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int charCount = input.length();
        String[] words = input.trim().split("\\s+");
        int wordCount = input.trim().isEmpty() ? 0 : words.length;
        System.out.println("Total characters: " + charCount);
        System.out.println("Total words: " + wordCount);
        sc.close();
    }
}