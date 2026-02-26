import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String letters with commas:");
        String input = sc.nextLine();
        String[] parts = input.split(",");
        System.out.println("Separated values:");
        for (String part : parts) {
            System.out.println(part.trim());
        }
        sc.close();
    }
}