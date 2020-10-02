package lab_7.Colors;

import java.util.Comparator;

public class CompareBySaturation implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        HSVColor color1 = (HSVColor) o1;
        HSVColor color2 = (HSVColor) o2;

        return Float.compare(color1.getSaturation() , color2.getSaturation());
    }

}
