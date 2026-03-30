import java.util.Scanner;
public class WashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); 
        System.out.print("Enter the number of clothes: ");
        int clothes = sc.nextInt();  
        String mode = "";      
        int duration = 0;    
        if (clothes > 10) {
            System.out.println("Overload of clothes!!!!!");
        } else {
            System.out.println("\nSelect Wash Mode:");
            System.out.println("1. Quick Wash  - 15 mins");
            System.out.println("2. Normal Wash - 30 mins");
            System.out.println("3. Heavy Wash  - 60 mins");
            System.out.println("4. Dry Only    - 20 mins");
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mode = "Quick Wash";
                    duration = 15;
                    break;
                case 2:
                    mode = "Normal Wash";
                    duration = 30;
                    break;
                case 3:
                    mode = "Heavy Wash";
                    duration = 60;
                    break;
                case 4:         
                    mode = "Dry Only";
                    duration = 20;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            if (!mode.equals("")) {
                System.out.println("\n----- Washing Machine Started -----");
                System.out.printf("User      : %s%n", name);
                System.out.printf("Clothes   : %d%n", clothes);
                System.out.printf("Mode      : %s%n", mode);
                System.out.printf("Duration  : %d mins%n", duration);
                System.out.println("Status    : Washing in progress... Please wait!");
                System.out.println("-----------------------------------");
            }
        }
        sc.close();
    }
}
