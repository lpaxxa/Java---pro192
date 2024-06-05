/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amyll
 */
public class Guitar {
    private String SerialNumber;
    private int price;
    private String builder;
    private String Model;
    private String BackWood;
    private String TopWood;
    
    public Guitar(String SerialNumber, int price, String builder, String Model, String BackWood, String TopWood) {
        this.SerialNumber = SerialNumber;
        this.price = price;
        this.builder = builder;
        this.Model = Model;
        this.BackWood = BackWood;
        this.TopWood = TopWood;
    }

    Guitar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public String getSerialNumber(){
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getBackWood() {
        return BackWood;
    }

    public void setBackWood(String BackWood) {
        this.BackWood = BackWood;
    }

    public String getTopWood() {
        return TopWood;
    }

    public void setTopWood(String TopWood) {
        this.TopWood = TopWood;
    }
   public void createSound(){
       System.out.println("Serial Number:"+ getSerialNumber() );
       System.out.println("Price:"+ getPrice());
       System.out.println("Builder:" + getBuilder());
       System.out.println("Model:"+ getModel());
       System.out.println("BackWood: " + getBackWood());
       System.out.println("Top Wood:"+ getTopWood());
   }
    
}
