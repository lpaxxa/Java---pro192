
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
public class Part1 {
    
    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        cols= sc.nextInt();
        matrix = new int[rows][cols];
        System.out.println("enter the matrix:");
        for ( int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("\nm["+i+"]["+j+"]=");
                matrix[i][j]=sc.nextInt();
                
                
            }
        }
        System.out.println("matrix inputted:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.printf("%3d",matrix[i][j]);
                
            }
            System.out.println("\n");
        }
        int sum=0;
        for (int i=0; i<rows;i++){
            for ( int j=0;j<cols;j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println("sum:"+sum);
        System.out.println("Average:"+(float)sum/(rows*cols));

    }
    
}
