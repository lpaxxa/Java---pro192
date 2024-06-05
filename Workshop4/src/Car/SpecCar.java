/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author vile
 */
public class SpecCar extends Car {

    private String color;

    public SpecCar() {
    }

    public SpecCar(String color) {
        this.color = color;
    }

    public SpecCar(String color, String owner, float price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return  super.owner +"," + super.price + "," + color  ;

    }

    public void setData() {
        String[] str = super.owner.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String string : str) {
            if (string.length() > 0) {
                sb.append(Character.toUpperCase(string.charAt(0)));
                sb.append(string.substring(1).toLowerCase());
                sb.append(" ");
            }

        }
        setOwner(sb.toString().trim());
        

    }
    
    public float getValue(){
        if ("Silver".equalsIgnoreCase(this.color)) {
            return (float) (price - price * 0.1);
        }else
            return price;
    }

}
