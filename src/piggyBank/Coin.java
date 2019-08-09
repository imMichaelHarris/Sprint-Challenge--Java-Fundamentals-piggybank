package piggyBank;

public abstract class Coin {
    private int quanity; 
    public static double totalInBank = 0;



    public Coin(){
        quanity = 1;
        totalInBank += getValue();
    }
    public Coin(int quanity){
        totalInBank += getValue() * quanity;
        this.quanity = quanity;
    }

    public abstract double getValue();
    public abstract double total();

    public int getQuanity(){
        return quanity;
    }
    public double removeAmount(double amount){
        return totalInBank -= amount;
    }
    public void removeCoin(){
        if(quanity > 1){
        quanity--;
        }
    }
    public void removeCoin(int quanity){
        if(this.quanity > quanity){
            this.quanity -= quanity;
        }
    }
    public double piggyBankTotal(){
        return totalInBank;
    }


}