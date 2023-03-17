/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author A. Alharbi
 */
public class Employee extends Admin {
    
    
    private int managerID;

    
    
    public Employee() {
    }
    
    public Employee (int managerID){
        this.managerID = managerID;
        
    }

    public Employee(double salaryPerHour, double hours, String Address, int ID, String firstName, 
            String lastName, int age, String username, String password , int managerID ) {
        super(Address, ID, firstName, lastName, age, username, password , salaryPerHour , hours);
        this.managerID = managerID;
    }
  
   
    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }   
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }
     
    
}
