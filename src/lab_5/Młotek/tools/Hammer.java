package lab_5.Młotek.tools;

import lab_5.Młotek.items.Nail;
import lab_5.Młotek.items.Wall;

public class Hammer {

    private String manufacturer;

    public Hammer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void nailNail(Nail nail , Wall wall){
        if(nail.isUsed()){
            System.out.println("Nail already used, cannot nail it again");
        }
        else{
            System.out.println("Hammer made by " + manufacturer + " nailed nail into " + wall.getColor() + " wall");
            nail.use();
       }
    }

    // klasa Hammer powinna przechowywac informacje o swoim producencie (jako String)

    // informacja o producencie powinna byc ustawiana na stale w jej konstruktorze

    // powinna też mieć metode pozwalajaca wbic gwozdz w sciane
    // metoda ta sprawdza, czy gwozdz byl uzyty
    // jezeli nie, to informuje (System.out.println) o tym jaki mlotek wbij gwozdz w jaka sciane
    // a nastepnie zmienia status gwozdzia na uzyty
    // jezeli tak, to informuje ze gwozdz byl juz zuzyty i nie da sie go wbic ponownie

}
