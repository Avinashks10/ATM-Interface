import java.util.Scanner;

class ATM {
    float balance;
    int PIN = 9847;
    Scanner sc = new Scanner(System.in);

    public void checkpin() {
        while (true) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();
            if (pin == PIN) {
                menu();
                break;
            } else {
                System.out.println("Incorrect PIN. Please try again.");
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\nWelcome to the ATM!");
            System.out.println("___________________________");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. EXIT");
            System.out.println("___________________________");
            System.out.print("Please select an option (1-4): ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your current balance is " + balance + "/- Rupees");
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    float deposit = sc.nextFloat();
                    balance += deposit;
                    System.out.println("Successfully Deposited the amount of " + balance + "/- Rupees");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    float withdraw = sc.nextFloat();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Successfully Withdrawed the amount of " + balance + "/- Rupees");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return; // Exit the method
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkpin();
    }
}

