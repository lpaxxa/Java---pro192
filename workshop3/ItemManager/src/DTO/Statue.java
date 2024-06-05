/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author amyll
 */
public class Statue extends Item {
    private int weight;
    private String colour;
    public Statue(){};

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void inputStatue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input weight:");
        weight=sc.nextInt();
        sc.nextLine();
        System.out.println("input colour:");
        colour=sc.nextLine();
        
    }
    public void outputStatue(){
        System.out.println("Weight of statue is: "+weight);
        System.out.println("Colour of tatue is: "+colour);
    }
    
}
