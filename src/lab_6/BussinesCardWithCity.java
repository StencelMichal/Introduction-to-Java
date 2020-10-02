package lab_6;

import lab_5.BussinesCard;

import java.util.ArrayList;

public class BussinesCardWithCity extends BussinesCard {

    private String city;

    BussinesCardWithCity(String name , String surname , String phoneNumber , String city ){
        super( name , surname , phoneNumber);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    protected ArrayList<String> getLines(){
        ArrayList<String> lines = super.getLines();
        lines.add(city);
        return lines;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res =  super.equals(obj);

        if (!res){
            return false;
        }

        BussinesCardWithCity card = (BussinesCardWithCity) obj;

        return city.equals(card.getCity());
    }
}
