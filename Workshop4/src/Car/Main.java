/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import java.util.Scanner;

/**
 *
 * @author vile
 */
public class Main {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter owner: ");
 String nOwner = sc.nextLine().toLowerCase().trim();
 System.out.print("Enter price: ");
 float nPrice = Float.parseFloat(sc.nextLine());
 System.out.print("Enter color: ");
 String nColor = sc.nextLine().toLowerCase().trim();
 Car st = new SpecCar(nColor, nOwner, nPrice);
 System.out.println("1. Test toString()");
 System.out.println("2. Test setData()");
 System.out.println("3. Test getValue()");
 System.out.print("Enter TC (1,2,3): ");
 int choice = sc.nextInt();
 switch(choice) {
 case 1:
 System.out.println("OUTPUT: ");
 System.out.println(st.toString());
 break;
 case 2:
 System.out.println("OUTPUT: ");
 ((SpecCar)st).setData();
 System.out.println(st.getOwner() + ", " + st.getPrice());
 break;
 case 3:
 System.out.println("OUTPUT: ");
 float price = ((SpecCar)st).getValue();
 System.out.println(price);
 break;
 }
 }
    
}
