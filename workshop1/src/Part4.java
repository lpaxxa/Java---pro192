
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
public class Part4 {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        String name= "";
        float grade;
        System.out.println("Input student's information");
        System.out.println("Input student's name:");
        name=sc1.nextLine();
        System.out.println("input student's grade:");
        grade=sc1.nextFloat();
        
        Scanner sc2= new Scanner(name);
        System.out.println("Output student's information");
        String[] words = name.split("\\s+");
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                formattedName.append(firstLetter).append(restOfWord).append(" ");
            }
        }
        
         System.out.print("Formatted student name: " + formattedName.toString().trim());
         System.out.println(",");
        System.out.println("Student grade: " + grade);
    }
    
}
