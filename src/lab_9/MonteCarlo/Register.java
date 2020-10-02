package lab_9.MonteCarlo;

public class Register {

    private final int howManyShoots;

    private int shootsTaken = 0;

    private int shootsOnTarget = 0;

    public Register(int howManyShoots) {
        this.howManyShoots = howManyShoots;
    }

    public synchronized int getShootsTaken() {
        return shootsTaken;
    }

    public synchronized void setShootsTaken(int shootsTaken) {
        this.shootsTaken = shootsTaken;
    }

    public synchronized int getShootsOnTarget() {
        return shootsOnTarget;
    }

    public synchronized void setShootsOnTarget(int shootsOnTarget) {
        this.shootsOnTarget = shootsOnTarget;
    }

    public synchronized boolean isFinished(){
        return shootsTaken >= howManyShoots;
    }

    public synchronized double currentPi(){
        if(shootsTaken != 0) {
            return (double) shootsOnTarget / (double) (shootsTaken) * 4.0;
        }
        else{
            return 0;
        }
    }
}
