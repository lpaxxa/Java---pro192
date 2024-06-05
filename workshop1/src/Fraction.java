/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vile
 */
public class Fraction {
    private int numerator;
    private int denominator;
    

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        if(denominator !=0){
            this.numerator = numerator;
        this.denominator = denominator;
        }else
            throw new IllegalArgumentException("Denominator cannot be zero");
        
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0){
            
        
        this.denominator = denominator;
        }else {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
    }
    
    public int findGCD(int a, int b){
        a=Math.abs(a); b=Math.abs(b);
        while (a!=b){
            if(a>b){
                a-=b;
                
            }else {
                b-=a;
            }
        }
    return a;
    
}
    public void simplifyFraction(){
        int i= findGCD(this.getNumerator(),this.getDenominator());
        this.setNumerator(this.getNumerator()/i);
        this.setDenominator(this.getDenominator()/i);
    }
        public Fraction addFraction(Fraction ps){
            int resultNumerator= (this.numerator* ps.denominator)+ (ps.numerator* this.denominator);
            int resultDenominator= this.denominator * ps.denominator;
            Fraction result= new Fraction(resultNumerator, resultDenominator);
            result.simplifyFraction();
            return result;
        }

    
    public Fraction subFraction(Fraction ps){
            int resultNumerator= (this.numerator* ps.denominator) - (ps.numerator* this.denominator);
            int resultDenominator= this.denominator * ps.denominator;
            Fraction result= new Fraction(resultNumerator, resultDenominator);
            result.simplifyFraction();
            return result;
        }
    public Fraction mulFraction(Fraction ps){
            int resultNumerator= this.numerator* ps.numerator;
            int resultDenominator= this.denominator * ps.denominator;
            Fraction result= new Fraction(resultNumerator, resultDenominator);
            result.simplifyFraction();
            return result;
        }
    public Fraction divFraction(Fraction ps){
            int resultNumerator= this.numerator * ps.denominator;
            int resultDenominator= this.denominator *  ps.numerator;
            Fraction result= new Fraction(resultNumerator, resultDenominator);
            result.simplifyFraction();
            return result;
        }
    public String output()
    {
        return numerator + "/" + denominator; 
       
    }

    
    
    
    }
