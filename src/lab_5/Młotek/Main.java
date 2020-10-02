package lab_5.Młotek;
import lab_5.Młotek.items.Nail;
import lab_5.Młotek.items.Wall;
import lab_5.Młotek.tools.Hammer;

public class Main {

    public static void main(String[] args) {

        Nail n1 = new Nail();
        Nail n2 = new Nail();
        Nail n3 = new Nail();
        Nail n4 = new Nail();

        Hammer h1 = new Hammer( "Michal");
        Hammer h2 = new Hammer("Ewela");

        Wall w1 = new Wall("red");
        Wall w2 = new Wall("blue");

        h1.nailNail( n1 , w1);
        h2.nailNail( n2 , w2);
        h1.nailNail(n1 , w2);
        h1.nailNail(n2,w2);

        w1.changeColor("violet");

        h1.nailNail( n4 , w1);
        h2.nailNail( n3 , w2);
        h1.nailNail(n3 , w2);
        h1.nailNail(n4,w2);


        // klasa Main w metodzie main:
        // - tworzy kilka gwozdzi
        // - tworzy dwa mlotki roznych producentow
        // - tworzy dwie sciany w roznych kolorach
        // - probuje wbijac te gwozdzie mlotkami w sciany
        // - w szczegolnosci sprawdza, czy mozna wbic dany gwozdz dwa razy
        // - probuje rowniez zmieniac kolor istniejacej sciany i sprawdzic, jak wplynie to na dalsze akcje z jej udzialem
    }
}
