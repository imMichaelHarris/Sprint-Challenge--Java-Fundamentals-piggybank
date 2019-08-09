package piggyBank;

public class Penny extends Coin{
    private String name = "Penny";
    private double value = .01;

    public Penny(){

    }
    public Penny(int quanity){
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
        return getQuanity() + " Pennies";
    }
}