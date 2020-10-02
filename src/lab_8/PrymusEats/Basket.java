package lab_8.PrymusEats;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Dish> dishes = new ArrayList<>();

    private float price = 0;

    public void addToBasket(Dish dish){
        dishes.add(dish);
        price += dish.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Dish dish :
                dishes) {
            String nextDish = dish.toString();
            res.append(nextDish);
            res.append('\n');
        }
        res.append("Total cost").append(price);
        return res.toString();
    }
}
