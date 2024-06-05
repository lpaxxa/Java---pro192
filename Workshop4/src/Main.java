
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
public class Main {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 boolean flag=true;
 

      
 
 System.out.print("Enter code: ");
 String nCode = sc.nextLine().toLowerCase().trim();
// System.out.print("Enter price: ");
// int nPrice = Integer.parseInt(sc.nextLine());
 
 int nPrice = 0;
        do{
            System.out.print("Enter Price: ");
            try {
                nPrice = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Price is an integer!");
            }
        }while(true);
 
 int ncolor = 0;
        do{
            System.out.print("Enter color: ");
            try {
                ncolor = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Colour is an integer!");
            }
        }while(true);
 
// System.out.print("Enter color: ");
// int nColor = Integer.parseInt(sc.nextLine());
 Item it = new SpecItem(ncolor, nCode, nPrice);
 
 int choice = 0;
 
 do{
 System.out.println("1. Test outputSpecItem()");
 System.out.println("2. Test setData()");
 System.out.println("3. Test getValue()");
 System.out.println("4. exit ");
 System.out.print("Enter TC (1,2,3,4): ");
 choice = sc.nextInt();
 switch(choice) {
 case 1:
//     flag=false;
 System.out.println("OUTPUT: ");
 ((SpecItem)it).outputSpecItem();
 break;
 case 2:
//     flag=false;
 System.out.println("OUTPUT: ");
 ((SpecItem)it).setData();
 it.outputItem();
 break;
 case 3:
//     flag=false;
 System.out.println("OUTPUT: ");
 int price = ((SpecItem)it).getValue();
 System.out.println(price);
 break;
 case 4:
//    flag=false;
 System.out.println("Exiting.....");
 
 break;
 default:
     
     System.out.println("Input a different choice !!! ");
 }
 }while (choice != 4);
 }
    
}
