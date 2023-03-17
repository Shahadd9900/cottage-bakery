/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.Person;

/**
 *
 * @author Dana
 */

public class Customer extends Person{
    private String phoneNumber1 , phoneNumber2 = "Non" ;
    private String address;
    private String email;
    public Customer() {
    }

    public Customer(int id, String address, String phoneNumber1 ,String phoneNumber2 , String firstName, String lastName, String gender,
            int age , String username , String pass , String mail) {
        super(id , firstName, lastName, gender, age , username , pass);
        this.address = address;
        this.email = mail;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber1() {
            return this.phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber) {
        this.phoneNumber1 = phoneNumber ;
    }
    public String getPhoneNumber2() {
            return this.phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber) {
        this.phoneNumber2 = phoneNumber ;
    }
    
    @Override
    public String toString()
    {
    return super.toString() + "\nAddress: " + address + "\nemail: " + email  + "\nPhone Number1: " 
            + phoneNumber1  + "\nPhone Number2: " + phoneNumber2;
    }
}