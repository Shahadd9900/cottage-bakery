/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Dana
 */

public class Person {
    
    private int ID;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String username;
    private String password;
    
    public Person() {
    }
    
     public Person(int id,String firstName, String lastName, String gender, int age ,
             String username , String password ) {
        this.firstName = firstName; 
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.ID = id;
        this.username = username;
        this.password = password;
    }
     
     public Person(int ID, String firstName, String lastName, int age, String username, String password) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.password = password;
    }
     
    public String getPass() {
        return password;
    }

    public void setPass(String pass) {
        this.password = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()
    {
    return "ID: " + ID + "\nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nGender: "+gender+"\nAge: "+ age +"\n";
    }
    
}
