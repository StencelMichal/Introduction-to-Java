package lab_10.Streams;

import java.util.Comparator;


public class ValueComparator implements Comparator<HSVColor> {

	@Override
	public int compare(HSVColor color1, HSVColor color2) {
		if (color1.getValue() > color2.getValue()) {
			return 1;
		} else if (color1.getValue() == color2.getValue()) {
			return 0;
		}
		return -1;
	}
}
