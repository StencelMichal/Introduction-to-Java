package lab_5.Młotek.items;

public class Nail {

    // gwozdz przechowuje informacje o tym czy byl uzyty (jako boolean)
    // nowo stworzony gwozdz nie jest uzyty

    private boolean used;

    public Nail(){
      used = false;
    }

    public boolean isUsed() {
        return used;
    }

    public void use(){
        used = true;
    }

}
