package piggyBank;

public class Nickel extends Coin{
    private static int nickels = 0;
    private String name = "Nickel";
    private double value = .05;

    public Nickel(){
        nickels++;
    }
    public Nickel(int quanity){
        nickels += quanity;
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
        return getQuanity() + " Nickels";
    }
}