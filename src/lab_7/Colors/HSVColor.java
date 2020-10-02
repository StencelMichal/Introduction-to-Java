package lab_7.Colors;

public class HSVColor implements Comparable {

    private int hue;

    private float saturation;

    private float value;

    HSVColor( int hue , float saturation , float value) throws ColorFormatException {

        if ( hue < 0 || hue > 360){
            throw new ColorFormatException("Color Format Exception byczq");
        }

        if ( saturation < 0.0 || saturation > 1.0){
            throw new ColorFormatException("Color Format Exception byczq");
        }

        if ( value < 0.0 || value > 1.0 ){
            throw new ColorFormatException("Color Format Exception byczq");
        }

        this.hue = hue;
        this.saturation = saturation;
        this.value = value;

    }

    @Override
    public int compareTo(Object o) {
        HSVColor color = (HSVColor) o;
        return Float.compare(value, color.value);
    }

    public void setSaturation(float saturation) {
        this.saturation = saturation;
    }

    public float getSaturation() {
        return saturation;
    }

    public void setHue(int hue) {
        this.hue = hue;
    }

    public int getHue() {
        return hue;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
