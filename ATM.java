import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        int balance = 10000;
        int deposit;
        int debited;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-----------ATM-------------");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Balance enquiry");
            System.out.println("Choose 4 for Exit");

            System.out.print("Enter your Choice: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("Enter amount to be withdrawn: ");
                    debited = sc.nextInt();
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
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out
                            .println("Your money has been successfully deposited.\nYour current balance is:" + balance);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Let's proceed with the balance enquiry: ");
                    System.out.println("Balance:" + balance);
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}