package gui.controller.property;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MakePropertyAvailableController extends SwitchScene {

    @FXML
    TextField propertyID;

    @FXML
    public void submit(){
        String res = Constant.api.makePropertyAvailable(propertyID.getText());
    }

    @FXML
    public void onHomeClicked(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN, event);
    }
}
