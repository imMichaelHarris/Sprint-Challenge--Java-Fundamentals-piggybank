package piggyBank;

public class Penny extends Coin{
    private String name = "Penny";
    private double value = .01;

    
    public Penny(String name, double value, int quanity){
        super(name, value, quanity);
    }

}