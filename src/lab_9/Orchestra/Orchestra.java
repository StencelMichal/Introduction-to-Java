package lab_9.Orchestra;

import java.util.ArrayList;

public class Orchestra implements Instrument {

    private ArrayList<Instrument> instruments = new ArrayList<>();

    public void addInstrument( Instrument instrument ){
        instruments.add(instrument);
    }

    public void play(){

        Thread[] threads = new Thread[instruments.size()];

        for(int i=0 ; i<instruments.size() ; i++){
            threads[i] = new Thread(instruments.get(i));
        }


        for (Thread thread :
                threads) {
            thread.start();
        }

        for (Thread thread :
                threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("koniec koncertu");
    }

    @Override
    public void run() {
        play();
    }

    public static void main(String[] args) throws BrokenInstrumentException {

        Instrument flute = new Flute(3 , 600);
        Instrument trombone = new Trombone(5 , 1000);
        Instrument guitar = new Guitar(2, 3000);
        Instrument brokenPiano = new BrokenPiano(2 , 5000);

        Orchestra o = new Orchestra();
        o.addInstrument(flute);
        o.addInstrument(trombone);
        o.addInstrument(guitar);
        o.addInstrument(brokenPiano);

        try {
            o.run();
        } catch (BrokenInstrumentException e ){
            System.out.println("lol");
            e.printStackTrace();
        }



    }
}
