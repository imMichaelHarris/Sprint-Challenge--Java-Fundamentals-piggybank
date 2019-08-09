package piggyBank;

public class Dollar extends Coin {
    private static int dollars = 0;
    private String name = "Dollar";
    private double value = 1.00;

    public Dollar(){
        dollars++;
    }
    public Dollar(int quanity){
        dollars += quanity;
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
        return "$" + getQuanity();
    }
}