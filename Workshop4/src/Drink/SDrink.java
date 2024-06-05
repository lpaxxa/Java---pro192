/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drink;

/**
 *
 * @author vile
 */
public class SDrink {
    String make;
    double price;

    public SDrink() {
    }

    public SDrink(String make, double price) {
        this.make = make;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return  make + "," + price ;
    }
    
    
          
    
}
