package piggyBank;

public abstract class Coin {
    protected String name;
    protected double value;


    public Coin(String name, double value){
        this.name = name;
        this.value = value;
    }
}