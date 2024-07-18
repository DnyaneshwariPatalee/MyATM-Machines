import java.util.Scanner;

public class JavaATM {
    private double balance;
    
    public JavaATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You have successfully withdrawn $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JavaATM atm = new JavaATM(500); // Initial balance set to $500

        while (true) {
            System.out.println("\nATM Machine:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
