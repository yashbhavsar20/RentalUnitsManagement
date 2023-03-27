package gui.controller;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TenantScreenController extends SwitchScene {

    @FXML
    public void onHomeClick(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN,event);
    }
}
