package lab_5;

public class Turret {

    private static int idx = 0;
    private int number;
    private int ammo;

    Turret(){
        idx ++;
        number = idx;
        if(number % 3 == 0)
            ammo = 0;
        else
            ammo = 10;
    }

    public void shoot() {
        if( ammo > 0){
            System.out.println("Turret: " + number +" BOOM!");
            ammo --;
        }
        else
            System.out.println("Turret: " + number +"...OOPS!");
    }

    @Override
    public String toString() {
        return "Turret " + number + ", current ammo: " + ammo;
    }

    public static void main(String[] args) {
        Turret[] turrets = new Turret[10];
        for(int i=0; i<turrets.length; i++) {
            turrets[i] = new Turret();
        }
        for(Turret turret : turrets) {
            System.out.println(turret);
        }
        for(Turret turret : turrets) {
            turret.shoot();
        }
        for(Turret turret : turrets) {
            System.out.println(turret);
        }
    }

}