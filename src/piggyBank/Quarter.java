package piggyBank;

public class Quarter extends Coin {
    private String name = "Quarter";
    private double value = .25;

    
    public Quarter(int quanity){
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