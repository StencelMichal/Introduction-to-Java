package lab_9.Drummers;

import java.util.ArrayList;
import java.util.List;

public class Drummers implements Runnable{

    private List<Drummer> drummersList = new ArrayList<>();

    public Drummers( String... names) {

        Drummstick firstDrummstick = new Drummstick();
        Drummstick lastDrummstick = firstDrummstick;
        for (String name : names) {
            Drummstick nextDrummstick = new Drummstick();
            Drummer drummer = new Drummer( lastDrummstick , nextDrummstick , name);
            drummersList.add(drummer);
            lastDrummstick = nextDrummstick;
        }
        drummersList.get(names.length - 1).setRightDrumstick(firstDrummstick);

    }

    @Override
    public void run() {
        for (Drummer drummer : drummersList) {
            Thread thread = new Thread(drummer);
            thread.start();
        }
    }

    public static void main(String[] args) {
        Drummers band = new Drummers( "Aba" , "Baba" , "Gaba" , "Laba" , "Zaba");

        System.out.println(band.drummersList.get(0).getName());
        System.out.println("left");
        System.out.println(band.drummersList.get(0).getLeftDrumstick());
        System.out.println("right");
        System.out.println(band.drummersList.get(0).getRightDrumstick());

        System.out.println(band.drummersList.get(4).getName());
        System.out.println("left");
        System.out.println(band.drummersList.get(4).getLeftDrumstick());
        System.out.println("right");
        System.out.println(band.drummersList.get(4).getRightDrumstick());

        band.run();
    }
}
