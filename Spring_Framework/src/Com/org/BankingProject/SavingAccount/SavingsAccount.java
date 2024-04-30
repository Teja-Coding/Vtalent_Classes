package Com.org.BankingProject.SavingAccount;

import Com.org.BankingProject.Sevice.Account;

public class SavingsAccount implements Account  {
	   private double balance;

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
}
