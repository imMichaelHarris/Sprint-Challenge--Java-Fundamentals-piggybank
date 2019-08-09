package piggyBank;

import java.util.*;

public class Main {
    private static void createCoins() {
        Coin penny = new Coin("Penny", .01);
        System.out.println(penny);
    }
    public static void main(String[] args){
        createCoins();
    }
}