import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nCurrent State: " + user.getCurrentStateName());
            System.out.println("1. Activate");
            System.out.println("2. Disable");
            System.out.println("3. Lock");
            System.out.println("4. Buy");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(user.activate());
                    break;
                case 2:
                    System.out.println(user.disable());
                    break;
                case 3:
                    System.out.println(user.lock());
                    break;
                case 4:
                    System.out.println(user.buy());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}