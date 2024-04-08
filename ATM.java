import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----------ATM-------------");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Balance Enquiry");
            System.out.println("Choose 4 for Exit");

            System.out.print("Enter your Choice: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Consume the invalid input
                continue;
            }
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("Enter amount to be withdrawn: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number.");
                        sc.next(); // Consume the invalid input
                        continue;
                    }
                    int debited = sc.nextInt();
                    if (debited <= balance) {
                        balance -= debited;
                        System.out.println("Please collect the amount.");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number.");
                        sc.next(); // Consume the invalid input
                        continue;
                    }
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited.");
                    System.out.println("Your current balance is: " + balance);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Let's proceed with the balance enquiry: ");
                    System.out.println("Balance: " + balance);
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
                    break;
            }
        }
    }
}
