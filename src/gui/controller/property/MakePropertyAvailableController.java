package gui.controller.property;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MakePropertyAvailableController extends SwitchScene {

    @FXML
    TextField propertyID;
    @FXML
    Label resLabel;

    @FXML
    public void submit(ActionEvent event) throws InterruptedException, IOException {
        String res = Constant.api.makePropertyAvailable(propertyID.getText());
        resLabel.setText(res);
        if(res.equals("Property is now available")){
            propertyID.setText("");
        }
    }

    @FXML
    public void onHomeClicked(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN, event);
    }
}
