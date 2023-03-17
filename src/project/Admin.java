/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.Person;

/**
 *
 * @author A. Alharbi
 */
public class Admin extends Person {
    
    public String Address;
    public double Salary;
    private double hours;

    
    private double salaryPerHour;
    

    public Admin() {
    }

    public Admin ( String Address , double Salary){

    this.Address = Address;
    this.Salary = Salary;
    
    
    }

    public Admin(String Address, int ID, String firstName, String lastName, 
        int age, String username, String password , double salaryPerhour , double hours) {
        super(ID, firstName, lastName, age, username, password);
        this.Address = Address;
       
        this.hours = hours;
        this.salaryPerHour= salaryPerhour;
        this.Salary = this.hours * this.salaryPerHour;
    }
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }
    public double getSalary(){
    return Salary;
    }

    public void setSalary(double Salary){
    this.Salary = Salary;
    }
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
     @Override
    public String toString()
    {
    return super.toString() + "\nAddress: " + Address +"\nSalary: " + Salary+"\n";
    }
    
}
