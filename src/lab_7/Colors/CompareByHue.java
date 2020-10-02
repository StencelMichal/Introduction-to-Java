package lab_7.Colors;

import java.util.Comparator;

public class CompareByHue implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        HSVColor color1 = (HSVColor) o1;
        HSVColor color2 = (HSVColor) o2;

        return Integer.compare(color1.getHue() , color2.getHue());
    }
}
