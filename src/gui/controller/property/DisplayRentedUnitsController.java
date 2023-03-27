package gui.controller.property;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.IOException;

public class DisplayRentedUnitsController extends SwitchScene {
    @FXML
    ListView outputListView;

    @FXML
    public void onHomeClicked(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN, event);
    }

    public void showRentedUnits(String rentedUnits){
        outputListView.getItems().add(rentedUnits);
    }

}
