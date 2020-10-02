package lab_8.trip;

public class PetrolEngine implements Engine {

    private int fuel;

    private boolean isTurnOn;

    public PetrolEngine(){
        this(0);
    }

    public PetrolEngine( int fuelAmount ){
        fuel = fuelAmount;
        isTurnOn = false;
    }

    public void addFuel( PetrolFuel fuel){
        this.fuel += fuel.howMuch();
    }



    public void setTurnOn(boolean turnOn) {
        isTurnOn = turnOn;
    }

    public boolean isTurnOn() {
        return isTurnOn;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on petrol engine");
        isTurnOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("turning off petrol engine");
        isTurnOn = false;
    }

    @Override
    public int GetFuel() {
        return fuel;
    }
}
