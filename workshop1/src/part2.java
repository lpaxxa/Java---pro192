
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amy
 */
public class part2 {
    public static void main(String[] args) {
        float num1,num2;
        String op;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the first number:");
        num1= sc.nextFloat();
        System.out.println("Input the second number:");
        num2= sc.nextFloat();
        System.out.println("Input an operator (+ - * /):");
        sc=new Scanner(System.in);
        op=sc.nextLine();
        if(op.equals("+")){
            System.out.println("The result of"+ num1 + op + num2 +"=" + (num1+num2));
        }
        else if (op.equals("-")){
            System.out.println("The result of"+ num1 + op + num2 +"=" + (num1-num2));
        }
        else if (op.equals("*")){
            System.out.println("The result of"+ num1 + op + num2 +"=" + (num1*num2));
        }
        else if (op.equals("/")){
            System.out.println("The result of"+ num1 + op + num2 +"=" + (num1/num2));
        }       
                
    }
    
}
