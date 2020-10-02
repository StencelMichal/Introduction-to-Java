package lab_9.MonteCarlo;

import java.util.*;

public class PiCalculator implements Runnable {

    private RegisterSupervisor registerSupervisor;

    private List<Thread> shooters = new ArrayList<>();

    public PiCalculator(int numberOfShooters, int howManyShoots) {

        Register register = new Register(howManyShoots);
        registerSupervisor = new RegisterSupervisor(5 , register);

        for(int i=0 ; i<numberOfShooters ; i++){
            Shooter shooter = new Shooter( 30 , register);
            shooters.add(new Thread(shooter));
        }

        Thread regThread = new Thread(registerSupervisor);
        shooters.add(new Thread(regThread));



    }

    @Override
    public void run() {
        for (Thread thread :
                shooters) {
            thread.start();
        }
    }

    public static void main(String[] args) {

        PiCalculator calc = new PiCalculator(4 , 999999999);
        calc.run();
    }
}
