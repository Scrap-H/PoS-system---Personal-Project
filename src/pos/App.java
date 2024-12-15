package pos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner Uin = new Scanner(System.in);
        int choice;

        do {

            System.out.println("~~Menu~~\n");

            System.out.println("1 | Order");
            System.out.println("2 | edit Items");
            System.out.println("5 | Exit");

            System.out.print("Enter your choice: ");
            
            while (!Uin.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                Uin.next();
                System.out.print("Enter your choice: ");
            }

            choice = Uin.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Test1");
                    break;

                case 2:
                    System.out.println("Test2");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 5);

    }
}
