package pytriplecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController {

	@FXML
	private TextArea output;

	@FXML
	private TextField number1TextField;

	@FXML
	private TextField number2TextField;

	@FXML
	protected void generateTriple() {

		try {
			int number1 = 0;
			int number2 = 0;
			while (true) {

				if (Integer.parseInt(number1TextField.getText()) > Integer
						.parseInt(number2TextField.getText()))
					break;

				number1 = Integer.parseInt(number1TextField.getText())
						+ (int) (Math.random() * ((Integer
								.parseInt(number2TextField.getText()) - Integer
								.parseInt(number1TextField.getText())) + Integer
								.parseInt(number1TextField.getText())));
				number2 = Integer.parseInt(number1TextField.getText())
						+ (int) (Math.random() * ((Integer
								.parseInt(number2TextField.getText()) - Integer
								.parseInt(number1TextField.getText())) + Integer
								.parseInt(number1TextField.getText())));

				if (number2 > number1)
					break;
			}
			printTriple(number1, number2);
		} catch (NumberFormatException e) {
			output.setText("Number 1 is the minimum, Number 2 is the maximum");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	protected void createTriple() {
		try {
			printTriple(Double.parseDouble(number1TextField.getText()),
					Double.parseDouble(number2TextField.getText()));
		} catch (NumberFormatException e) {
			output.setText("Please input a number");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void printTriple(double number1, double number2) {
		try {
			TripleCreator tCreator = new TripleCreator(number1, number2);

			if (number1 < number2) {
				String[] tripleStringArray = tCreator.toStringArray();

				String outputText = "";
				for (String triplePart : tripleStringArray) {
					outputText = outputText + triplePart + "\n";
				}
				output.setText(outputText);
			} else {
				output.setText("Number 2 must be greater that Number 1");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	protected void openChessClient(ActionEvent event) {
		final WebView browser = new WebView();
		final WebEngine webEngine = browser.getEngine();
		webEngine.load("http://tommsy64.github.io/Chess-Client/");
	}
}