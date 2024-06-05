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
public class SpecWatch extends Watch {
    private int size;

    public SpecWatch() {
    }

    public SpecWatch(int size) {
        this.size = size;
    }

    public SpecWatch(int size, String code, double price) {
        super(code, price);
        this.size = size;
    }
    
    public void setData(){
        String str = "XYZ";
        StringBuilder sb = new StringBuilder(getCode());
        
        sb.replace(0, 2, str);
       code = sb.toString();
        
        setCode(sb.toString());
    }
        
    
    public double getValue(){
            if(this.size <= 39){
                return super.price - (super.price * 0.1);
            }
            else
                return super.price + (super.price * 0.5);
        }
    
    public void outputSpecWatch(){
        System.out.println(super.code + "," + super.price);
        System.out.println(super.code + "," + super.price + "," + size);
        
        
    }
}



  
    
    


