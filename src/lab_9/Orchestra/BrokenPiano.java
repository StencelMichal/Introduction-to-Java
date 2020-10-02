package lab_9.Orchestra;

public class BrokenPiano extends SingleInstrument{

    public BrokenPiano(int howMany, int time) {
        super(howMany, time);
    }

    @Override
    public void play() throws BrokenInstrumentException {
        throw new BrokenInstrumentException("Zepsute pianinko");
    }

}
