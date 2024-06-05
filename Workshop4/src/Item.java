/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vile
 */
public class Item {
    String code;
    int price;

    public Item() {
    }

    public Item(String code, int price) {
        this.code = code;
        this.price = price;
    }
    
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void outputItem(){
        System.out.println(code + ","  + price);
       
    }
    
    
}
