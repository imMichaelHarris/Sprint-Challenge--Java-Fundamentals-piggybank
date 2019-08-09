package piggyBank;

public abstract class Coin {
    protected String name;
    protected double value;
    protected int quanity = 1;
    

    public Coin(String name, double value, int quanity){
        this.name = name;
        this.value = value;
        this.quanity = quanity;
    }
}