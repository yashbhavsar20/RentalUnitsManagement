package gui.controller;

import gui.constants.Constant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import gui.utils.SwitchScene;

import java.io.IOException;

public class HomeScreenController extends SwitchScene {
    @FXML
    public void onPropertyButtonClicked(ActionEvent event) throws IOException {
        screenSwitch(Constant.PROPERTY_SCREEN, event);
    }

    @FXML
    public void onTenantButtonClicked(ActionEvent event) throws IOException {
        screenSwitch(Constant.TENANT_SCREEN, event);
    }

    @FXML
    public void onLeasesButtonClicked(ActionEvent event) throws IOException{
        screenSwitch(Constant.LEASE_SCREEN,event);
    }



}
