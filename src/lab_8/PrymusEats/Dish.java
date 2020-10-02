package lab_8.PrymusEats;

public class Dish {

    private float price;

    protected String name;

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + " - " + price;
    }
}
