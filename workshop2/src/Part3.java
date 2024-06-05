/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vile
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {
        try{
    
        File file = new File("employee.txt");
        
        Scanner sc = new Scanner(file);
        
        sc.useDelimiter("\\n");

        while (sc.hasNext()) {
            String employee = sc.next();
            System.out.println(employee);

        }
    
        sc.close();
        }catch(FileNotFoundException e){
                System.out.println("The system cannot find the file specified.");
                }

    }
    }
