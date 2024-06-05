
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
public class Part3 {
    public static void main(String[] args) {
        String[] list= new String[10];
        
        Scanner sc= new Scanner (System.in);
        for (int i=0;i<10;i++){
            System.out.println("Rnter a list of student name:");
            
          String studentName = sc.nextLine();
            String capitalizedStudentName = studentName.substring(0, 1).toUpperCase() + studentName.substring(1);
            list[i] = capitalizedStudentName;   
        }
       
        System.out.println("the list of student is:");
        for (int i=0;i<10;i++){
             System.out.print(list[i]);
            if(i<9){
                System.out.print(",");
            }
            }
        System.out.println( );
        
    }
    }
    

