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
public class Vase extends Item {
    private int height;
    private String material;
    public Vase(){
        
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void inputVase(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter vase's height: ");
        height=sc.nextInt();
        sc.nextLine();
        System.out.println("enter vase's material");
        material=sc.nextLine();
    }
    public void outputVase(){
        System.out.println("Height is:" +height);
        System.out.println("Material is:" +material);
    }
    
}
