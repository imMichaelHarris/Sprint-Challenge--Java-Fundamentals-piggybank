package piggyBank;

public class Quarter extends Coin {
    private static int quarters = 0;
    private String name = "Quarter";
    private double value = .25;

    public Quarter(){
        quarters++;
    }
    public Quarter(int quanity){
        quarters += quanity;
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