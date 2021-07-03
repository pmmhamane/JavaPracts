package com.myphone.contactdetails;

import java.util.ArrayList;

public class Contacts {


    private int mobNumber;
    private String name;


    public Contacts(int mobNumber, String name) {
        this.mobNumber = mobNumber;
        this.name = name;
    }

    public int getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(int mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Contacts createContact(String name , int mobNumber){
        return new Contacts(mobNumber,name);
    }

}
