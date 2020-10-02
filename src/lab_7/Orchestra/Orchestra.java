package lab_7.Orchestra;

import java.util.ArrayList;

public class Orchestra implements Instrument{

    private ArrayList<Instrument> instruments = new ArrayList<>();

    public void addInstrument( Instrument instrument ){
        instruments.add(instrument);
    }

    public void play(){
        for (Instrument instrument :
                instruments) {
            instrument.play();
        }
    }

    public static void main(String[] args) {

        Instrument flute = new Flute();
        Instrument trombone = new Trombone();
        Instrument guitar = new Guitar();

        Orchestra orchestra = new Orchestra();

        orchestra.addInstrument(flute);
        orchestra.addInstrument(trombone);
        orchestra.addInstrument(guitar);

        orchestra.play();
    }
}
