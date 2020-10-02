package lab_9.Drummers;

public class Drummer implements Runnable{

    private Drummstick LeftDrumstick;

    private Drummstick RightDrumstick;

    private final String name;

    public Drummer(Drummstick leftDrumstick, Drummstick rightDrumstick, String name) {
        LeftDrumstick = leftDrumstick;
        RightDrumstick = rightDrumstick;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRightDrumstick(Drummstick rightDrumstick) {
        RightDrumstick = rightDrumstick;
    }

    public Drummstick getLeftDrumstick() {
        return LeftDrumstick;
    }

    public Drummstick getRightDrumstick() {
        return RightDrumstick;
    }

    @Override
    public void run() {
        while(true){

            synchronized (LeftDrumstick) {
                if (LeftDrumstick.isUsed()) {
                    System.out.println(name + " cannot get left drummstick");
                    try {
                        LeftDrumstick.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(name + " putting up left drummstick");
                    LeftDrumstick.setStete(true);
                }
            }

            synchronized (RightDrumstick) {
                if (RightDrumstick.isUsed()) {
                    System.out.println(name + " cannot get right drummstick");
                    try {
                        RightDrumstick.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(name + " putting up right drummstick");
                    RightDrumstick.setStete(true);
                }
            }

            System.out.println(name + " playing drumms");

            synchronized (LeftDrumstick) {
                System.out.println(name + " putting away left drummstick");
                LeftDrumstick.setStete(false);
                LeftDrumstick.notify();
            }

            synchronized (RightDrumstick) {
                System.out.println(name + " putting away right drummstick");
                RightDrumstick.setStete(false);
                RightDrumstick.notify();
            }

        }
    }
}
