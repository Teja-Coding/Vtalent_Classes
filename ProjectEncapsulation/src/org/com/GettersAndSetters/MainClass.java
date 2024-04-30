package org.com.GettersAndSetters;

public class MainClass {
	public static void main(String[] args) {
		Account acc=new Account();
		
		acc.setAccNum(45456545);
		acc.setName("manikanta");
		
		int accountNumber=acc.getAccNum();
		String accountName=acc.getName();
		
		System.out.println("AccountNumber: "+accountNumber);
		System.out.println("AccountName: "+accountName);
	}
}
