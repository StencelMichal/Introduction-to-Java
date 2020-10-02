package lab_8.trip;

public class PetrolFuel implements Fuel {

    private int amount;

    public PetrolFuel( int amount ){
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int howMuch() {
        return amount;
    }
}
