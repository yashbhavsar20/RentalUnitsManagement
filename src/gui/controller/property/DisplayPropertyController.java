package gui.controller.property;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class DisplayPropertyController {

    @FXML
    Label propertiesLabel;

    @FXML
    public void showProperties(String properties) {
        propertiesLabel.setText("Hello" + properties);
    }
}
