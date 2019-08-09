package piggyBank;

import java.util.*;

public class Main {
    private static void createCoins() {
        Coin penny = new Coin("Penny", .01, 12);
        Coin nickel = new Coin("Nickel", .05);
        Coin dime = new Coin("Dime", .10);
        Coin quarter = new Coin("Quarter", .25, 3);
        Coin dollar = new Coin("Dollar", 1.00, 7);
        System.out.println(penny);
        System.out.println(nickel);
        System.out.println(dime);
        System.out.println(quarter);
        System.out.println(dollar);

        ArrayList<Coin> piggyBank = new ArrayList<Coin>();

        piggyBank.add(new Coin("Quarter", .25, 3));
        piggyBank.add(new Coin("Dime", .10))

        piggyBank.add(new Coin("Dollar", 1.00, 5))
        
        piggyBank.add(new Coin("Nickel", .05, 3))
        
        piggyBank.add(new Coin("Dime", .10, 7))
        
        piggyBank.add(new Coin("Dollar", 1.00))
        
        piggyBank.add(new Coin("Penny", .01, 10))
    }
    public static void main(String[] args){
        createCoins();
    }
}