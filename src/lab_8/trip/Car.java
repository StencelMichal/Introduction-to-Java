package lab_8.trip;

public class Car {

    private Engine CarsEngine;

    public void setCarsEngine(Engine carsEngine) {
        CarsEngine = carsEngine;
    }

    public Engine getCarsEngine() {
        return CarsEngine;
    }

    public Car(Engine engineType) {
        this.CarsEngine = engineType;
    }

    public void start() {
        System.out.println("Engine start");
        CarsEngine.turnOn();
    }

    public void stop() {
        System.out.println("Engine stop");
        CarsEngine.turnOff();
    }

    public void drive() throws OutOfFuelException, EngineIOffException {

        if (CarsEngine.GetFuel() <= 0)
            throw new OutOfFuelException("Exception: Car is out of fuel");

        if (!(CarsEngine.isTurnOn()))
            throw new EngineIOffException("Exception: Engine isn't turn on");

        System.out.println("Car is moving");
    }

    public static void main(String[] args) throws OutOfFuelException, EngineIOffException {

        PetrolEngine e1 = new PetrolEngine();
        PetrolEngine e2 = new PetrolEngine();

        Car Honda = new Car(e1);
        Car Audi = new Car(e2);

        PetrolFuel p1 = new PetrolFuel(13);
        PetrolFuel p2 = new PetrolFuel(0);


        e1.addFuel(p1);
        e2.addFuel(p2);

        try {
            Honda.start();
            Honda.drive();
            Honda.stop();
        } catch (OutOfFuelException | EngineIOffException exception){
                System.out.println(exception.getMessage());
        } finally {
            Honda.stop();
        }

        System.out.println();

       try {
            Audi.start();
            Audi.drive();
            Audi.stop();
        }catch( OutOfFuelException | EngineIOffException exception){
            System.out.println(exception.getMessage());
        }


    }
}

