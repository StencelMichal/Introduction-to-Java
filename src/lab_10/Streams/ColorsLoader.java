package lab_10.Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColorsLoader {

	public static List<HSVColor> loadColors(String filename) throws FileNotFoundException {
		List<HSVColor> colors = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(filename))) {
			while (scanner.hasNextLine()) {
				String colorLine = scanner.nextLine();
				colors.add(parseColor(colorLine));
			}
		}
		return colors;
	}

	private static HSVColor parseColor(String colorString) {
		String[] colorLineSplit = colorString.split(";");
		return new HSVColor(Integer.parseInt(colorLineSplit[0]), Double.parseDouble(colorLineSplit[1]),
				Double.parseDouble(colorLineSplit[2]));
	}
}
