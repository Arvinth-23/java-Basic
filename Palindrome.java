import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Me The Number:");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println(temp + " is a Palindrome");
        } else {
            System.out.println(temp + " is not a Palindrome");
        }
    }
}
