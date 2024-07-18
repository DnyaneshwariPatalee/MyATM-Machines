class ATMMachine:
    def __init__(self, initial_balance):
        self.balance = initial_balance

    def check_balance(self):
        print(f"Your balance is: ${self.balance}")

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"You have successfully deposited ${amount}")
        else:
            print("Invalid deposit amount")

    def withdraw(self, amount):
        if amount > 0 and amount <= self.balance:
            self.balance -= amount
            print(f"You have successfully withdrawn ${amount}")
        elif amount > self.balance:
            print("Insufficient balance")
        else:
            print("Invalid withdrawal amount")

def main():
    atm = ATMMachine(500)  # Initial balance set to $500

    while True:
        print("\nATM Machine:")
        print("1. Check Balance")
        print("2. Deposit")
        print("3. Withdraw")
        print("4. Exit")

        choice = int(input("Choose an option: "))

        if choice == 1:
            atm.check_balance()
        elif choice == 2:
            amount = float(input("Enter deposit amount: "))
            atm.deposit(amount)
        elif choice == 3:
            amount = float(input("Enter withdrawal amount: "))
            atm.withdraw(amount)
        elif choice == 4:
            print("Thank you for using the ATM. Goodbye!")
            break
        else:
            print("Invalid option. Please try again.")

if __name__ == "__main__":
    main()
