package org.com.HashMap.project;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {
	private Map<String, String> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
        System.out.println(name + " has been added to the address book.");
    }

    public String getPhoneNumber(String name) {
        String phone = contacts.get(name);
        if (phone != null) {
            return phone;
        } else {
            return "Contact not found.";
        }
    }

    public void removeContact(String name) {
        String phone = contacts.remove(name);
        if (phone != null) {
            System.out.println(name + "'s contact has been removed from the address book.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found in the address book.");
        } else {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                String name = entry.getKey();
                String phone = entry.getValue();
                System.out.println(name + ": " + phone);
            }
        }
    }
}