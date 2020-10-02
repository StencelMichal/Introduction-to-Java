package lab_9.Orchestra;

public class Trombone extends SingleInstrument{

    public Trombone(int howMany, int time) {
        super(howMany, time);
    }

    public void play(){
        System.out.println("Gram se na puzonie");
    }
}
