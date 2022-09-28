package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactList;

    public MobilePhone() {
        this.contactList = new ArrayList<Contact>();
    }

    private int findContact(Contact contact) {
        for (int i=0; i<contactList.size(); i++) {
            if (contactList.indexOf(contact) >= 0) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i=0; i<contactList.size(); i++) {
            if (contactList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addContact(Contact contact) {
        String name = contact.getName();
        if (findContact(name) < 0) {
            contactList.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public void printContact() {
        for (int i=0; i<contactList.size(); i++) {
            System.out.println((i+1) + ". " + contactList.get(i).getName() + " -> " + contactList.get(i).getPhoneNumber() + " -> " + contactList.get(i).getEmail());
        }
    }
}
