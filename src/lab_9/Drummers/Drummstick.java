package lab_9.Drummers;

public class Drummstick {

    private boolean state = false;

    public synchronized void setStete(boolean state) {
        this.state = state;
    }

    public synchronized boolean isUsed(){
        return state;
    }
}
