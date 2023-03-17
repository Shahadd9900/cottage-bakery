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
public class Manager extends Admin 
{
    int numOfEmployee ;
    Manager(){}
    Manager(int numOfE)
    {
        this.numOfEmployee = numOfE;
    }
    Manager(double salaryPerHours , double hours ,  String Address, int ID, String firstName, 
            String lastName, int age, String username, String password )
    {
        super(Address, ID, firstName, lastName, age,username, password , salaryPerHours ,hours);      
    }

    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(int numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }
    
}
