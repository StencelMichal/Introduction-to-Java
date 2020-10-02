package lab_9.MonteCarlo;

import java.util.Random;

public class Shooter implements Runnable{

    private int seriesOfShoots;

    private Register register;

    public Shooter(int seriesOfShoots, Register register) {
        this.seriesOfShoots = seriesOfShoots;
        this.register = register;
    }

    @Override
    public void run() {

        Random rand = new Random();

        while(!(register.isFinished())){

            int shootsOnTarget = 0;

            for( int i=0 ; i<seriesOfShoots ; i++){

                double x = rand.nextFloat();
                double y = rand.nextFloat();

                double distance = (double) (Math.pow(x , 2) + Math.pow(y , 2));
                distance = Math.sqrt(distance);

                if( distance <= 1.0){
                    shootsOnTarget ++;
                }
            }

            register.setShootsOnTarget(register.getShootsOnTarget() + shootsOnTarget);
            register.setShootsTaken(register.getShootsTaken() + seriesOfShoots);
        }
    }
}
