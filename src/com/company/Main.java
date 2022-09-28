package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean flag = true;
        int num = 0;
        printInstructions();
        while (flag) {
            System.out.println("Enter your choice: ");
            num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    addMyContact();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print contact list.");
        System.out.println("\t 2 - To add an contact.");
        System.out.println("\t 3 - To quit.");
//        System.out.println("\t 4 - To remove contact.");
//        System.out.println("\t 5 - To quit the application.");
    }

    public static void addMyContact() {
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email address: ");
        String email = scanner.nextLine();
        Contact contact = Contact.addContact(name, phoneNumber, email);
        if (mobilePhone.addContact(contact)) {
            System.out.println("Contact " + name + " successfully added " + name + " -> " + phoneNumber + " -> " + email);
        } else {
            System.out.println("Contact already exists");
        }
    }
}
