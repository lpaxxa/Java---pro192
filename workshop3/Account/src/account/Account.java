/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.Scanner;

/**
 *
 * @author vile
 */
public class Account {

    Scanner sc = new Scanner(System.in);

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    


    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
//        System.out.println("Enter amount:");
//        amount = sc.nextInt();
        balance = amount + balance;
        return balance;
    }

    public int debit(int amount) {
//        System.out.println("Enter amount:");
//        amount = sc.nextInt();
        if (amount>0 && amount <= balance) {

            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance!!!");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
//        System.out.println("Enter amount:");
//        amount = sc.nextInt();
        if (amount > 0 && amount <= balance) {
            this.debit(amount);
            another.credit(amount);

        } else {
            System.out.println("amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + ", id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }

}
