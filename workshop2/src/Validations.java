
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
public class Validations {
   public static Scanner sc = new Scanner(System.in);
       public static String inputNonBlankString(String msg){
           String input;
           do{
               System.out.println(msg);
               input=sc.nextLine().trim();
               if(input.isEmpty()){
                   System.out.println("input cannot be blank.Please try again");
               }
           }while (input.isEmpty());
           return input.toUpperCase();
       }
       
       public static String inputPattern(String msg, String pattern){
           String input;
           do{
               System.out.println(msg);
               input=sc.nextLine().trim();
               if(!input.matches(pattern)){
                   System.out.println("Invalid input. Please try again.");
               }
           }while(!input.matches(pattern));
           return input;
       }
       
       public static String inputGender(String msg, String pattern) throws Exception{
           String gender;
           String input;
           do{
               System.out.println(msg);
               input = sc.nextLine();
               if(!input.matches(pattern)){
               System.out.println("Invalid Input");
           }
           }
           while(!input.matches(pattern));
           if(input.equals("1")){
               gender = "male";
           }
           else
           {
               gender="female";
           }
           return gender;
           
       }

   
   
    
}
