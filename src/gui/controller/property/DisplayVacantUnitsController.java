package gui.controller.property;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;

import java.io.IOException;

public class DisplayVacantUnitsController extends SwitchScene {

    @FXML
    ListView outputListView;

    @FXML
    public void onHomeClicked(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN, event);
    }

    public void showVacantUnits(String vacantUnits){
        outputListView.getItems().add(vacantUnits);
    }
}
