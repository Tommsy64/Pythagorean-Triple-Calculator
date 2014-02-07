package pytriplecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	private TextArea output;

	@FXML
	private TextField number1TextField;

	@FXML
	private TextField number2TextField;

	@FXML
	private Button createButton;

	@FXML
	private Button generateButton;

	@FXML
	protected void generateTriple() {

	}

	@FXML
	protected void createTriple() {
		try {
			TripleCreator tCreator = new TripleCreator(
					Double.parseDouble(number1TextField.getText()),
					Double.parseDouble(number2TextField.getText()));

			if (Double.parseDouble(number1TextField.getText()) < Double
					.parseDouble(number2TextField.getText())) {
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
}