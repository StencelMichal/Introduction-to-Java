package lab_7.Polygon;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Polygon {

    private float sideA;

    private float sideB;

    private float sideC;



    Triangle( float sideA , float sideB , float sideC){
        super(sideA , sideB , sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public float surface() {

        float p = this.permieter();
        p /= 2;

        float surface = p * (p - sideA) * (p - sideB) * (p - sideC);
        surface = (float) Math.sqrt(surface);

        return surface;
    }


}
