/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Dana
 */
public class Project {
    private static Customer customer = new Customer();
    private static  Orders orders = new Orders();
    private static Manager manager = new Manager();
    private static Employee employee = new Employee();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LoadingFrame load=new LoadingFrame();
       WelcomeFrame wf = new WelcomeFrame();
       
       load.setVisible(true);
       try
       {
           for(int i = 0 ; i <= 100 ; i++)
           {
           Thread.sleep(40);
           load.countLabel.setText(""+ (i) +"%"); 
           load.jProgressBar1.setValue(i);
           if(i==100)
           {
               load.setVisible(false);
               wf.setVisible(true);
           }
                   }
           
       } catch (InterruptedException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    
    public static void addCustomer(Customer cust)
    {
        customer = cust;   
    }
    
    public static Customer getCustomer(){
        return customer ;
    } 
    public static void addOrder(Orders order)
    {
        orders = order;   
    }
    public static Orders getOrders() {
        return orders;
    }
    
    public static void addEmployee(Employee emp)
    {
        employee = emp;   
    }
    
    public static Employee getEmployee(){
        return employee ;
    }
    public static Manager getManager() {
        return manager;
    }

    public static void setManager(Manager manag) {
        manager = manag;
    }

    public static void setEmployee(Employee emp) {
        employee = emp;
    }
    
    
}
