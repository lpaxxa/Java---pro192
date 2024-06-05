
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
public class Part2 {
    public static void main(String[] args) {
        boolean cont=false;
        do{
            try{
                String s = "";
                String pattern = "^SE\\d{3}$";
                System.out.println("Enter your ID (SExxx): ");
                Scanner sc= new Scanner(System.in);
                s=sc.next();
                if ( !s.matches(pattern))
                    throw new Exception();
                System.out.println("The string is "+s);
                cont=false;
                
        }catch (Exception e){
                System.out.println("The string is invalid");
                cont = true;
        }
    }while (cont);
         
    
}
}
