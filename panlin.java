/*This Program is Solved in Leet Code Which enables to check the number is Panlindrom whether is palindrome return true and false is not 
palindrome  */

class Solution {
    public boolean isPalindrome(int x) {
       Scanner sc = new Scanner(System.in);
       int temp = x;
       int rev = 0;
       while ( x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
       }
       if (rev == temp && temp >= 0){
        return true;
       }
       else {
        return false;
       }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();

    }
}

