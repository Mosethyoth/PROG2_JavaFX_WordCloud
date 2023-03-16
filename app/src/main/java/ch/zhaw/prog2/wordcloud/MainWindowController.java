package ch.zhaw.prog2.wordcloud;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindowController {

    @FXML
    private Label lableTitel;

    @FXML
    private TextField textEingabe;

    @FXML
    private TextArea textHistory;

    public void initialize() {
        lableTitel.textProperty().bind(textEingabe.textProperty());
    }

    @FXML
    void hinzufuegenText(ActionEvent event) {
        textHistory.appendText(textEingabe.getText() + System.lineSeparator());
    }

    @FXML
    void leerenTextEingabe(ActionEvent event) {
        textEingabe.clear();
    }
}
