/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author vile
 */
public class Car {
    String owner;
    float price;

    public Car() {
    }

    public Car(String owner, float price) {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public float getPrice() {
        return price;
    }
    
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return    owner + "," + price ;
    }
    
    
}
