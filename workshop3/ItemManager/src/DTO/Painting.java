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
public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    public Painting(){};

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

   

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void outputPainting(){
        System.out.println("height is:"+height);
        System.out.println("width is:"+width);
        System.out.println("it is watercoloured:"+isWatercolour);
        System.out.println("It is Framed"+isFramed);
        
    }
    public void inputPainting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height:");
        height = sc.nextInt();
        sc.nextLine();
        System.out.println("Inpuut width: ");
        width = sc.nextInt();
        if (isWatercolour=true){
            System.out.println("it is water coloured");
        }
        else
            System.out.println("it is not watercoloured");
        
        if (isFramed=true){
            System.out.println("The painting is framed");
        }
            else
            System.out.println("The painting is framed");
        
                
         
    }
    
}
