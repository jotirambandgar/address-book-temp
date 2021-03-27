package com.bridgelabz.addressbook;

public class AddressBookMain {
    Contact contact;
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
    }

    public boolean createContact(Contact contact) {
        this.contact = contact;
        if(this.contact == null){
            return false;
        }
        return true;
    }
}
