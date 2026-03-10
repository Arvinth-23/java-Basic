import java.util.Scanner;
public class Info{
    public static void main(String [] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        char name = sc.next().charAt(0);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        System.out.println("Enter your Gender:");
        char gen = sc.next().charAt(0);
        System.out.println("Enter your CGPA:");
        double cgpa = sc.nextDouble();
        if (gen == 'M' || gen == 'm'){
            System.out.println("M");
        }
        else {
            System.out.println("F");
        }
     sc.close();
    }
}