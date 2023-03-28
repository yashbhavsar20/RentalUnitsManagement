package gui.controller;

import gui.constants.Constant;
import gui.controller.lease.DisplayLeaseController;
import gui.controller.property.DisplayRentedUnitsController;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class LeaseScreenController extends SwitchScene{
    @FXML
    public void onRentUnitButton(ActionEvent event) throws IOException{
        screenSwitch(Constant.RENT_UNIT,event);
    }
    @FXML
    public void onHomeClick(ActionEvent event) throws IOException{
        screenSwitch(Constant.HOME_SCREEN,event);
    }

    @FXML
    public void onDisplayLeasesButton(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(Constant.DISPLAY_LEASE));
        root = loader.load();

        DisplayLeaseController displayLeaseController = loader.getController();
        displayLeaseController.showAllLeases(Constant.api.getAllLease());
        screenSwitch(root, event);
    }
}
