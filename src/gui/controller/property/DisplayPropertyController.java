package gui.controller.property;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;


public class DisplayPropertyController {

    @FXML
    ListView outputListView;

    @FXML
    public void showProperties(String properties) {
        outputListView.getItems().add(properties);
    }
}
