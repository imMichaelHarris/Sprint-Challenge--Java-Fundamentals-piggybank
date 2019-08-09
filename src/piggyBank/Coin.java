package piggyBank;

public abstract class Coin {
    private static int quanity; 


    public Coin(){
        quanity = 1;
    }
    public Coin(int quanity){
        this.quanity = quanity;
    }

    public abstract double getValue();
    public abstract double total();

    public int getQuanity(){
        return quanity;
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


}