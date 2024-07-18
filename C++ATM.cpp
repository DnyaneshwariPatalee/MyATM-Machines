#include <iostream>
using namespace std;

class ATMMachine {
private:
    double balance;

public:
    ATMMachine(double initialBalance) : balance(initialBalance) {}

    void checkBalance() {
        cout << "Your balance is: $" << balance << endl;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "You have successfully deposited $" << amount << endl;
        } else {
            cout << "Invalid deposit amount" << endl;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            cout << "You have successfully withdrawn $" << amount << endl;
        } else if (amount > balance) {
            cout << "Insufficient balance" << endl;
        } else {
            cout << "Invalid withdrawal amount" << endl;
        }
    }
};

int main() {
    ATMMachine atm(500); // Initial balance set to $500
    int choice;
    double amount;

    while (true) {
        cout << "\nATM Machine:" << endl;
        cout << "1. Check Balance" << endl;
        cout << "2. Deposit" << endl;
        cout << "3. Withdraw" << endl;
        cout << "4. Exit" << endl;

        cout << "Choose an option: ";
        cin >> choice;

        switch (choice) {
            case 1:
                atm.checkBalance();
                break;
            case 2:
                cout << "Enter deposit amount: ";
                cin >> amount;
                atm.deposit(amount);
                break;
            case 3:
                cout << "Enter withdrawal amount: ";
                cin >> amount;
                atm.withdraw(amount);
                break;
            case 4:
                cout << "Thank you for using the ATM. Goodbye!" << endl;
                return 0;
            default:
                cout << "Invalid option. Please try again." << endl;
        }
    }
}