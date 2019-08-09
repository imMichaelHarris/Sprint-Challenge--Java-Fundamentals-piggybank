package piggyBank;

import java.util.*;

public class Main {
    private static void createCoins() {
        Penny penny = new Penny(12);
        // Coin nickel = new Coin("Nickel", .05);
        // Coin dime = new Coin("Dime", .10);
        // Coin quarter = new Coin("Quarter", .25, 3);
        // Coin dollar = new Coin("Dollar", 1.00, 7);
        // System.out.println(nickel);
        // System.out.println(dime);
        // System.out.println(quarter);
        // System.out.println(dollar);

        ArrayList<Coin> piggyBank = new ArrayList<Coin>();

        piggyBank.add(new Quarter());

        piggyBank.add(new Dime());
        
        piggyBank.add(new Dollar(5));
        
        piggyBank.add(new Nickel(3));
        
        piggyBank.add(new Dime(7));
        
        piggyBank.add(new Dollar());
        
        piggyBank.add(new Penny(10));
        
        double totalInBank = 0;
        for (Coin c : piggyBank){
            totalInBank += c.total();
        }
        System.out.println("The piggy bank holds $" + totalInBank);
    }
    public static void main(String[] args){
        createCoins();
    }
}