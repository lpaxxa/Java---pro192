
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vile
 */
public class Part2_2 {

    public String inputStirng() throws Exception {
        String pattern = "^SE\\d{6}$";
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string: ");
        s = sc.nextLine();
        if (!s.matches(pattern)) {
            throw new Exception();
        }
        return s;        
    }
    public static void main(String[] args) {
        Part2_2 obj=new Part2_2();
        boolean cont=false;
        do{
            try{
                String s=obj.inputStirng();
                System.out.println("the string is " +s);
                cont=false;
        }catch(Exception e){
                System.out.println("The string is invalid");
                cont=true;
        }
    }while(cont);

}
}
