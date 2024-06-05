/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

/**
 *
 * @author amyll
 */
public class AntiqueShop {

    public static void main(String[] args) {
        Item item = null;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Create a vase");
            System.out.println("2.Create a statue");
            System.out.println("3.Create a painting");
            System.out.println("4.Display the items");
            System.out.println("Input a choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;

                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {         // NOTE: Java is case-sensitive. 'vase' should be 'Vase'.
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object first");
                    }

                    break;
            }
        } while (choice <= 4);

    }

}
