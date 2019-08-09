package piggyBank;

public class Dime extends Coin {
    private String name = "Dime";
    private double value = .10;

    public Dime(){}
    public Dime(int quanity){
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
        return getQuanity() + " Dimes";
    }
}