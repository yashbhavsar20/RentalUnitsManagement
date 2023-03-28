package gui.controller.lease;

import gui.constants.Constant;
import gui.controller.LeaseScreenController;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;

import java.io.IOException;

public class DisplayLeaseController extends SwitchScene {
    @FXML ListView outputListView;
    @FXML
    public void onHomeClicked(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN,event);
    }
    @FXML
    public void showAllLeases(String allLeases){
        outputListView.getItems().add(allLeases);
    }
}
