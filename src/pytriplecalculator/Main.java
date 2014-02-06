package pytriplecalculator;

import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.stage.Stage;

public class Main extends Application {

	private static final String VIEW_GAME = "pTripleCreator.fxml";
	private static final String STYLESHEET_FILE = "wordreverser/application.css";

	// public static final Image ICON = new Image(
	// Main.class.getResourceAsStream("icon.png"));

	@Override
	public void start(Stage primaryStage) {
		try {
			initGui(primaryStage);

			System.out.println("Please enter a digit");

			Scanner input = new Scanner(System.in);
			int m = input.nextInt();

			System.out.println("Please enter another digit that is less than "
					+ m);

			int n = input.nextInt();

			int a = m * m - n * n;

			int b = 2 * m * n;

			int c = m * m + n * n;

			System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initGui(final Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource(VIEW_GAME));
		Scene scene = SceneBuilder.create().root(root).build();
		scene.getStylesheets().add(STYLESHEET_FILE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Word Reverser");
		// primaryStage.getIcons().add(ICON);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
