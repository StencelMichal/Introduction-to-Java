package lab_10.Streams;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

public class ColorsDisplayer extends Application {

	private List<Color> createColorsToDisplay() throws FileNotFoundException {
		List<HSVColor> colors = ColorsLoader.loadColors("colors.csv");

		return colors.stream()
				.filter(color -> color.getValue() > 0.5)
				.distinct()
				.sorted((color1, color2) -> {
					if (color1.getValue() > color2.getValue()) {
						return 1;
					} else if (color1.getValue() == color2.getValue()) {
						return 0;
					}
					return -1;
				})
				.map( hsvColor -> Color.hsb(hsvColor.getHue(), hsvColor.getSaturation(), hsvColor.getValue()))
				.collect( Collectors.toList());

	}

	private List<HSVColor> getBrightColors(List<HSVColor> colors) {
		return colors.stream()
				.filter(color -> color.getValue() > 0.5)
				.collect( Collectors.toList());
	}

	private List<Color> convertColors(List<HSVColor> hsvColors) {
		return hsvColors.stream()
				.map( hsvColor -> Color.hsb(hsvColor.getHue(), hsvColor.getSaturation(), hsvColor.getValue()))
				.collect(Collectors.toList());
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();

		HBox colorBox = new HBox();
		pane.setCenter(colorBox);

		for (Color color : createColorsToDisplay()) {
			Rectangle colorRect = new Rectangle(20, 20);
			colorRect.setFill(color);
			colorBox.getChildren().add(colorRect);
		}

		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(ColorsDisplayer.class, args);
	}
}
