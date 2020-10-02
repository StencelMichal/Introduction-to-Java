package lab_8.PrymusEats;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private DishOfTheDay dishOfTheDay;

    private ChiefsDish chiefsDish;

    private List<Dish> menu;

    public Restaurant(DishOfTheDay dishOfTheDay, ChiefsDish chiefsDish, List<Dish> menu) {
        this.dishOfTheDay = dishOfTheDay;
        this.chiefsDish = chiefsDish;
        this.menu = menu;
    }

    public void printMenu(){

        System.out.println(dishOfTheDay);
        System.out.println();
        System.out.println(chiefsDish);
        System.out.println();

        for (Dish dish :
                menu) {
            System.out.println(dish);
        }
    }

    public static void main(String[] args) {

        Dish d1 = new Dish();
        d1.setName( "Pizza" );
        d1.setPrice(20);
        Dish d2 = new Dish();
        d2.setName("Kaszanka");
        d2.setPrice(13);
        Dish d3 = new Dish();
        d3.setName("Żurek");
        d3.setPrice(24);
        DishOfTheDay d4 = new DishOfTheDay();
        d4.setName("Lody");
        d4.setPrice(10);
        ChiefsDish d5 = new ChiefsDish();
        d5.setName("Tort");
        d5.setPrice(50);

        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(d1);
        dishes.add(d2);
        dishes.add(d3);

        Restaurant r1 = new Restaurant(d4, d5, dishes);

        r1.printMenu();



    }

}
