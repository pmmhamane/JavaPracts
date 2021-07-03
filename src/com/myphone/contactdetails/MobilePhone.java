package com.myphone.contactdetails;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

   static Scanner sc = new Scanner(System.in);


    public static void main(String args[]){

        ArrayList<Contacts> contactList = new ArrayList<>();

        String actionCd = null;
        boolean Quit = true;

        while(Quit){

            System.out.print("Enter your choice : ");
            actionCd = sc.nextLine();

            printInstrictions();

            switch(actionCd){
                case "1":
                    createContact();
                    break;

                case "2":
                    updateContact();
                    break;

                case "3":
                    removeContact();
                    break;
                    
                case "4":
                    Quit = false;
                    break;
                default :
                    System.out.println("Wrong choice !! ");
            }
        }

    }

    private static void removeContact() {
    }

    private static void updateContact() {
    }

    private static void printInstrictions() {
    }

    private static void createContact() {
        int mobNumber = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

    }
}
