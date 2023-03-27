package gui.controller;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LeaseScreenController extends SwitchScene{
    @FXML
    public void onRentUnitButton(ActionEvent event) throws IOException{
        screenSwitch(Constant.RENT_UNIT,event);
    }

    @FXML
    public void onDisplayLeasesButton(ActionEvent event) throws IOException{
        screenSwitch(Constant.HOME_SCREEN,event);
    }

    @FXML
    public void onHomeClick(ActionEvent event) throws IOException{
        screenSwitch(Constant.HOME_SCREEN,event);
    }
}
