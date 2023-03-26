package gui.controller;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class PropertyScreenController extends SwitchScene {
//    @FXML
    public void onHomeClick(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN, event);
    }
    public void onAddPropertyButton(ActionEvent event) throws IOException {
        screenSwitch(Constant.ADD_PROPERTY, event);
    }
    public void onDisplayPropertyButton(ActionEvent event) throws IOException {
        screenSwitch(Constant.DISPLAY_PROPERTY, event);
    }
    public void onDisplayRentedUnitsButton(ActionEvent event) throws IOException {
        screenSwitch(Constant.DISPLAY_RENTED_UNITS, event);
    }
    public void onDisplayVacantUnitsButton(ActionEvent event) throws IOException {
        screenSwitch(Constant.DISPLAY_VACANT_UNITS, event);
    }
    public void onMakePropertyAvailableButton(ActionEvent event) throws IOException {
        screenSwitch(Constant.MAKE_PROPERTY_AVAILABLE, event);
    }
}
