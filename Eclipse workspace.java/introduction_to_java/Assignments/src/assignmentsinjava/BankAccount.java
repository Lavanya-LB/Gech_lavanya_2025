package assignmentsinjava;

public class BankAccount {
	private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

	public static void main(String[] args) {
		//1. Create a BankAccount class with private fields for account number, account
		//holder name, and balance. Provide public methods to deposit and withdraw money 
		//while ensuring the balance cannot go negative.


		 BankAccount account = new BankAccount("66025260", "lavanya", 1000.0);
	        System.out.println(account.getAccountInfo());
	        account.deposit(500);
	        account.withdraw(300);
	        account.withdraw(1500); // Should print an error message



	}

	private char[] getAccountInfo() {
		String info = "Account Number: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: $" + String.format("%.2f", balance);
		return info.toCharArray();
	}
	

}
