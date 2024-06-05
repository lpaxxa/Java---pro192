
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
public class FractionDemo {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator of fration 1:");
        a = sc.nextInt();
        System.out.println("Enter denominator of fration 1:");
        b = sc.nextInt();

        System.out.println("Enter numerator of fration 2:");
        c = sc.nextInt();
        System.out.println("Enter denominator of fration 2:");
        d = sc.nextInt();

        Fraction fr1 = new Fraction(a, b);
        Fraction fr2 = new Fraction(c, d);
        
//        fr1.simplifyFraction();
//        fr2.simplifyFraction();

        Fraction sum = fr1.addFraction(fr2);
        Fraction sub = fr1.subFraction(fr2);
        Fraction mul = fr1.mulFraction(fr2);
        Fraction div = fr1.divFraction(fr2);
        
        

        System.out.println("sum of them:" + sum.output());
        System.out.println("subtraction of them:" + sub.output());
        System.out.println("multiplication of them:" + mul.output());
        System.out.println("division of them:" + div.output());

    }

}
