
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
public class StudentDemo {

    public static void main(String[] args) {
       
        System.out.println("Input Student's ìnormation: ");
        String code = Validations.inputPattern(" - Enter code (SExxxxxx): ", "SE\\d{6}");
        String name = Validations.inputNonBlankString(" - Enter name: ");
        String gender = "";
        boolean cont=false;
        do {
            try {
                gender = Validations.inputGender(" - Enter gender (1 or 0) ", " [0,1]{1}");
                cont = false;
            } catch (Exception e) {
                System.out.println("Invalid input.male: input is 1, female: input is 0");
                cont = true;
            }
        } while (cont);
        
        String address = Validations.inputNonBlankString(" - Enter address ");
        String phone = Validations.inputPattern(" - Enter phone (10-12)", "[0-9][10,12]");
        String email = Validations.inputPattern(" - Enter email: ","^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        
        System.out.println("Student Information");
        System.out.println(code + "," + name + " ," + gender + " ," + address + ", " + phone + " ," + email);

    }

}
