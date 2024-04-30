package Com.org.BankingProject.Test;

import Com.org.BankingProject.SavingAccount.SavingsAccount;
import Com.org.BankingProject.Sevice.Account;

public class BankingApplication {
	   public static void main(String[] args) {
	        // Create a SavingsAccount instance
	        Account savingsAccount = new SavingsAccount();
	        savingsAccount.deposit(500.0);
	        savingsAccount.withdraw(200.0);
	        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

	        // Create a CurrentAccount instance
	        Account currentAccount = new SavingsAccount();
	        currentAccount.deposit(1000.0);
	        currentAccount.withdraw(1500.0);
	        System.out.println("Current Account Balance: " + currentAccount.getBalance());
	    }
}
