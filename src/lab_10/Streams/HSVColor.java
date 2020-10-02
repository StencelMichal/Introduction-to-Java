package lab_10.Streams;

import java.util.Objects;

public class HSVColor implements Comparable<HSVColor> {

	private final int hue;

	private final double saturation;

	private final double value;

	public HSVColor(int hue, double saturation, double value) {
		this.hue = hue;
		this.saturation = saturation;
		this.value = value;
	}

	public int getHue() {
		return hue;
	}

	public double getSaturation() {
		return saturation;
	}

	public double getValue() {
		return value;
	}

	@Override
	public int compareTo(HSVColor o) {
		if (o.value < this.value) {
			return 1;
		} else if (o.value == this.value) {
			return 0;
		}
		return -1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hue, saturation, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HSVColor other = (HSVColor) obj;
		if (hue != other.hue)
			return false;
		if (Double.doubleToLongBits(saturation) != Double.doubleToLongBits(other.saturation))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

}
