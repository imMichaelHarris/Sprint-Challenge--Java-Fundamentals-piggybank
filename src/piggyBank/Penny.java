package piggyBank;

public class Penny extends Coin{
    private static int pennies = 0;
    private String name = "Penny";
    private double value = .01;

    public Penny(){
        pennies++;
    }
    public Penny(int quanity){
        pennies += quanity;
    }

    public int penniesInBank(){
        return pennies;
    }

    @Override 
    public double total(){
        return value * getQuanity();
    }

    @Override 
    public double getValue(){
        return value;
    }
    @Override
    public String toString(){
        return getQuanity() + " Pennies";
    }
}