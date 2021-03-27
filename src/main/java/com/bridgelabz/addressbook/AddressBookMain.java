package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    Contact contact;
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.contact = addressBookMain.getUserInput();
        System.out.println("new Contact---->" + addressBookMain.contact);
    }

    private Contact getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fist name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        return new Contact(firstName, lastName, phoneNumber);
    }

    public boolean createContact(Contact contact) {
        this.contact = contact;
        if(this.contact == null){
            return false;
        }
        return true;
    }
}
