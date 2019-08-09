package piggyBank;

public class Nickel extends Coin{
    private String name = "Nickel";
    private double value = .05;

    public Nickel(){}
    public Nickel(int quanity){
        super(quanity);
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