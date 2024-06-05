
import item.Item;
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
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();

        Item item = new Item(name, quantity);

        System.out.println("1.Test getName()");
        System.out.println("2.Test setQuantity()");
        System.out.println("Enter choice (1 or 2)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("OUTPUT: " + item.getName());

                break;

            case 2:
                System.out.println("Enter new quantity: ");
                int newQuantity = sc.nextInt();
                item.setQuantity(quantity);
                System.out.println("Updated quantity: " + item.getQuantity());
                break;
            default:
                System.out.println("Invalid choice!");
                break;

        }

    }
}
