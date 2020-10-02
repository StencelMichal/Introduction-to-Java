package lab_9.Orchestra;

public class Guitar extends SingleInstrument {

    public Guitar(int howMany, int time) {
        super(howMany, time);
    }

    public void play(){
        System.out.println("Grams se na gitarze");
    }
}
