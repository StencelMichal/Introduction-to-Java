package lab_9.Orchestra;

public abstract class SingleInstrument implements Instrument {

    private int howMany;

    private int time;

    public SingleInstrument(int howMany, int time) {
        this.howMany = howMany;
        this.time = time;
    }

    @Override
    public void run() {
        for(int i=0 ; i<howMany ; i++){
            play();
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
