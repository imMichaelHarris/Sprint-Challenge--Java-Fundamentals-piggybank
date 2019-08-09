package piggyBank;

public class Coin {
    private String name;
    private double value;
    private int quanity = 1;


    public Coin(String name, double value){
        this.name = name;
        this.value = value;
    }
    public Coin(String name, double value, int quanity){
        this.name = name;
        this.value = value;
        this.quanity = quanity;
    }

    public String getName(){
        return name;
    }
    public double getValue(){
        return value;
    }
    public int getQuanity(){
        return quanity;
    }

    @Override
    public String toString(){
        return getValue() * getQuanity() + " worth of " + getName();
    }
}