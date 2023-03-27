package gui.controller;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class TenantScreenController extends SwitchScene {

    @FXML
    public void onAddTenantButton(ActionEvent event) throws IOException{
        screenSwitch(Constant.ADD_TENANT,event);
    }
    @FXML
    public void onHomeClick(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN,event);
    }

}
