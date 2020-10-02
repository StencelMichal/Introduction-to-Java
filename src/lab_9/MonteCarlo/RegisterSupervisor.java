package lab_9.MonteCarlo;

public class RegisterSupervisor implements Runnable{

    private int interval;

    private Register register;

    public RegisterSupervisor(int interval, Register register) {
        this.interval = interval;
        this.register = register;
    }

    @Override
    public void run() {
        while (!(register.isFinished())) {
            System.out.println("Shoots taken: " + register.getShootsTaken());
            System.out.println("Current Pi number: " + register.currentPi());
            System.out.println("--------------");
            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finally:");
        System.out.println("Pi = " + register.currentPi());

    }


}
