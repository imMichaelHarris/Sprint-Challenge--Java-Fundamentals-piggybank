package piggyBank;

public class Dime extends Coin {
    private static int dimes = 0;
    private String name = "Dime";
    private double value = .10;

    public Dime(){
        dimes++;
    }
    public Dime(int quanity){
        super(quanity);
        dimes += quanity;
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
        return getQuanity() + " Dimes";
    }
}