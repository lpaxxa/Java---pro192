/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Watch;

/**
 *
 * @author vile
 */
public class Watch {
    String code;
    double price;

    public Watch() {
    }

    public Watch(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public void outputWatch(){
        System.out.println(code + "," + price);
    }
    
}
