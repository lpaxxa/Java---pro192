
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amyll
 */
public class part4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isvalid = false;
        do {
            try {

                String vin, model, brand, colour;

                System.out.println("Enter VIN: ");
                vin = sc.nextLine();
                if (vin.isEmpty()) {
                    throw new IllegalArgumentException("VIN cannot be blank");
                }

                System.out.println("Enter model: ");
                model = sc.nextLine();
                if (model.isEmpty()) {
                    throw new IllegalArgumentException("Model cannot be blank");
                }
                System.out.println("Enter brand: ");
                brand = sc.nextLine();
                if (brand.isEmpty()) {
                    throw new IllegalArgumentException("Brand cannot be blank");
                }
                System.out.println("Enter colour: ");
                colour = sc.nextLine();
                if (colour.isEmpty()) {
                    throw new IllegalArgumentException("Colour cannot be blank");
                }
                System.out.println("Enter engine power: ");
                int enginePower = sc.nextInt();
                if (enginePower <= 0) {
                    throw new IllegalArgumentException("Engine power must be greater than 0");

                }
                sc.nextLine();
                System.out.println("Is it convertible TRUE/FALSE: ");
                boolean convertible = Boolean.parseBoolean(sc.nextLine().trim().toLowerCase());

                System.out.println("Does it have a parking brake? TRUE/FALSE: ");
                boolean parkingBrake = Boolean.parseBoolean(sc.nextLine().trim().toLowerCase());
                isvalid = true;
                System.out.println("\nVehicle Information:" + vin + "," + model + "," + brand + "," + colour + "," + colour + "," + enginePower + "," + convertible + "," + parkingBrake);
//                System.out.println("VIN:"+vin);
//                System.out.println("Model"+model);
//                System.out.println("Brand"+brand);
//                System.out.println("Colour"+colour);
//                System.out.println("Engine Power: "+enginePower);
//                System.out.println("Convertible: " + convertible);
//                System.out.println("Parking Brake: " + parkingBrake);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            
            sc.nextLine();
            System.out.println("please try again");
            }
        } while (!isvalid);
        sc.close();
    }
}

