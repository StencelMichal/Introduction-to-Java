package lab_7.Polygon;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon {

    private List<Float> sides;

    public float permieter(){
        float res = 0;
        for (float side :
                sides) {
            res += side;
        }
        return res;
    }

    public abstract float surface();

    Polygon( float... sides){
        List<Float> constructorSides = new ArrayList<>();
        for (float side :
                sides) {
            constructorSides.add(side);
        }
        this.sides = constructorSides;
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle( 12 , 10 , 5);
        System.out.println(t1.surface());
        System.out.println(t1.permieter());

        Rectangle r1 = new Rectangle(2,6);
        System.out.println(r1.surface());
        System.out.println(r1.permieter());

        Square s1 = new Square(5);
        System.out.println(s1.surface());
        System.out.println(s1.permieter());


    }

}
