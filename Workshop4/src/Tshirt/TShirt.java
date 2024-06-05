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
public class TShirt {
    private String style;
    private int size;

    public TShirt() {
    }

    public TShirt(String style, int size) {
        this.style = style;
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public int getSize() {
        return size;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return  style + "," + size ;
    }


    
    
}
