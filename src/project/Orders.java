/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Haya alzahim
 */
public class Orders {
    private int orderNumber;
    private String productName;
    private String flavor="null";
    private String toppings="null";
    private double price;
    public static int numberOfOrders=0;
    public Orders(){};
    public Orders(int orderNumber, String productName, String flavor, String toppings, double price) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.flavor = flavor;
        this.toppings = toppings;
        this.price = price;
    }
    
    public Orders(int orderNumber, String productName, double price) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.price = price;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setTotal(double price) {
        this.price = price;
    }

    public static void setNumberOfOrders(int numberOfOrders) {
        Orders.numberOfOrders = numberOfOrders;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getToppings() {
        return toppings;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        if ((!flavor.equals("null")&&!flavor.equals("")&&!toppings.equals("null")&&!toppings.equals("")))
            return productName + " { " + flavor +", " + toppings + " }";
        else if (!flavor.equals("null")&&!flavor.equals(""))
            return productName + " { " + flavor +" }";
        return productName;
        
    }
    
    public String showInformation(){
        if ((!flavor.equals("null")&&!flavor.equals("")&&!toppings.equals("null")&&!toppings.equals("")))
            return productName + " { " + flavor +", " + toppings + " }"+ " " + orderNumber + " " + price ;
        else if (!flavor.equals("null")&&!flavor.equals(""))
            return productName + " { " + flavor +" }"+ " " + orderNumber + " " + price ;
        return productName + " " + orderNumber + " " + price ;
        
    }

}
