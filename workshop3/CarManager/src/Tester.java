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
        Car c = new Car("blue", 200, true, false);
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        
        Car c2=new Car("red",100,true,true);
        c2.pressAcceleratorButton();
        c2.setColour("black");
        System.out.println("Colour o c2:" +c2.getColour());
        c2.output();
        
    }
}
