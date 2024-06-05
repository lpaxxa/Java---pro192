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
public class Item {
    protected int value;
    protected String creator;
    public Item(){}

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
  
    public void input(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter a value grater than 0:");
            value = sc.nextInt();
            
        }while (value<=0);
        sc.nextLine();
       
        do{
            System.out.println("Input creator: ");
            creator = sc.nextLine();
        }while(creator.isEmpty());
        
        
    }
      public void output(){
        System.out.println("Value is:" + value);
        System.out.println("Creator is:"+ creator);
    }
    
    
}
