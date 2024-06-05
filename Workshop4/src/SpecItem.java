/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vile
 */
public class SpecItem extends Item {

    private int color;

    public SpecItem() {
    }

    public SpecItem(int color) {
        this.color = color;
    }

    public SpecItem(int color, String code, int price) {
        super(code, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setData() {
        String Str = "-ABC-";
        StringBuilder sb = new StringBuilder(code);

        sb.insert(2, Str);

        code = sb.toString();
        setCode(sb.toString());

    }

    public int getValue() {
        if (color > 5) {
            return price - 5;
        } else {
            return price - 3;
        }
    }

    public void outputSpecItem() {
        System.out.println(code + "," + price);
        System.out.println(code + "," + price + "," + color);

    }

}
