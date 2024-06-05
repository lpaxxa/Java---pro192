/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drink;

/**
 *
 * @author vile
 */
public class SpecDrink extends SDrink {

    private String unit;

    public SpecDrink() {
    }

    public SpecDrink(String unit) {
        this.unit = unit;
    }

    public SpecDrink(String unit, String make, double price) {
        super(make, price);
        this.unit = unit;
    }

    @Override
    public String toString() {
        return make + "," + price + "," + unit;

    }

    public void setData() {
        String[] str = make.split("-");
        StringBuilder sb = new StringBuilder();

        for (String str1 : str) {
            sb.append(str1).append(" ");

        }
        setMake(sb.toString().trim());
    }
    
    public double getValue(){
        if (unit.contains("24 cans"))
        {
            return price + price *0.05;
        }else
            return price;
    }
}
