package gui.controller.property;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;


public class DisplayPropertyController extends SwitchScene {

    @FXML
    ListView outputListView;

    @FXML
    public void showProperties(String properties) {
        outputListView.getItems().add(properties);
    }
    @FXML
    public void onHomeClicked(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN, event);
    }
}
