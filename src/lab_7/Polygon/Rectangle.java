package lab_7.Polygon;

public class Rectangle extends Polygon {

    private float sideA;

    private float sideB;

    Rectangle( float sideA , float sideB){
        super(sideA , sideA , sideB , sideB);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public float surface() {
        return sideA * sideB;
    }

}
