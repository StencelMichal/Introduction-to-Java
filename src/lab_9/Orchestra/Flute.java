package lab_9.Orchestra;

public class Flute extends SingleInstrument {

    public Flute(int howMany, int time) {
        super(howMany, time);
    }

    public void play(){
        System.out.println("Gram se na flecie");
    }

}
