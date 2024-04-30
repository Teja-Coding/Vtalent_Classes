package org.com.HashMap.project;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add contact");
            System.out.println("2. Get phone number");
            System.out.println("3. Remove contact");
            System.out.println("4. Display contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    addressBook.addContact(name, phone);
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    phone = addressBook.getPhoneNumber(name);
                    System.out.println(phone);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    addressBook.removeContact(name);
                    break;
                case 4:
                    addressBook.displayContacts();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }
}
