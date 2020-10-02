package lab_5.Młotek.items;

public class Wall {

    private String color;

    public Wall(String color){
        this.color = color;
    }

    public void changeColor( String color ){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // sciana przechowuje informacje o tym, jaki ma kolor (jako String)

    // informacja o kolorze powinna byc ustawiana w konstruktorze sciany

    // powinna byc tez mozliwosc zmiany koloru sciany po jej stworzeniu

}
