/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tshirt;

/**
 *
 * @author vile
 */
public class SpecTshirt extends TShirt{
    private int color;

    public SpecTshirt() {
    }


    public SpecTshirt(int color, String style, int size) {
        super(style, size);
        this.color = color;
    }
    

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    

    @Override
    public String toString() {
        
         return getStyle() + ", " + getSize() + ", " + getColor();
    }
    
    public void setData(){
        String str = "-";
        
        StringBuilder sb = new StringBuilder(getStyle());
        
        int penultimatePosition = getStyle().length() - 1;
        
        
       sb.insert(penultimatePosition, str);
    }
       
       public int getValue(){
           if(color <= 5){
               return getSize()+3;
           }else 
               return getSize();
       }
        
        
    }
    

   
    
    
    
    
    
    
    
    

