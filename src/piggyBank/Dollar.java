package piggyBank;

public class Dollar extends Coin {
    private String name = "Dollar";
    private double value = 1.00;

    
    public Dollar(int quanity){
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
}