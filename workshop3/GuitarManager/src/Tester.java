/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amyll
 */
public class Tester {
    public static void main(String[] args) {
      
        Guitar obj1 = new Guitar(null,0,null,null,null,null);
        Guitar obj2 = new Guitar("G123",2000,"Sony","Model123","hardWood","softWood");
        System.out.println("State of object 1: ");
        obj1.createSound();
        System.out.println("State of object 2: ");
        obj2.createSound();
        
        System.out.println("Set Price = 300 of obj1");
        obj1.setPrice(3000);
        System.out.println("Get Price of obj1:" + obj1.getPrice());
    }

   
    
}
