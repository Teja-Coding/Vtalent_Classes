package Com.org.BankingProject.CurrentAccount;

import Com.org.BankingProject.Sevice.Account;

public class CurrentAccount implements Account {
	 private double balance;
	    private double overdraftLimit;

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (balance + overdraftLimit >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setOverdraftLimit(double overdraftLimit) {
	        this.overdraftLimit = overdraftLimit;
	    }
}
