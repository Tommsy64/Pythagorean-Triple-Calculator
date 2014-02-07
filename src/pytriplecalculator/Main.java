package pytriplecalculator;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.stage.Stage;

public class Main extends Application {

	private static final String VIEW_GAME = "pTripleCreator.fxml";
	private static final String STYLESHEET_FILE = "pytriplecalculator/application.css";

	// public static final Image ICON = new Image(
	// Main.class.getResourceAsStream("icon.png"));

	@Override
	public void start(Stage primaryStage) {
		try {
			initGui(primaryStage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initGui(final Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource(VIEW_GAME));
		Scene scene = SceneBuilder.create().root(root).build();
		scene.getStylesheets().add(STYLESHEET_FILE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pythagorean Triplets Calculator");
		// primaryStage.getIcons().add(ICON);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
