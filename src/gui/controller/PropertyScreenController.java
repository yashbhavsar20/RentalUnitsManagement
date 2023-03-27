package gui.controller;

import gui.constants.Constant;
import gui.controller.property.DisplayPropertyController;
import gui.controller.property.DisplayRentedUnitsController;
import gui.controller.property.DisplayVacantUnitsController;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        FXMLLoader loader = new FXMLLoader(getClass().getResource(Constant.DISPLAY_PROPERTY));
        root = loader.load();

        DisplayPropertyController displayPropertyController = loader.getController();

        displayPropertyController.showProperties(Constant.api.getAllProperties());

//        To switch screen using root whenever something has changed in view
        screenSwitch(root, event);
    }
    public void onDisplayRentedUnitsButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(Constant.DISPLAY_RENTED_UNITS));
        root = loader.load();

        DisplayRentedUnitsController displayRentedUnitsController = loader.getController();
        displayRentedUnitsController.showRentedUnits(Constant.api.getAllRentedUnits());

        screenSwitch(root, event);
    }
    public void onDisplayVacantUnitsButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(Constant.DISPLAY_VACANT_UNITS));
        root = loader.load();

        DisplayVacantUnitsController displayVacantUnitsController = loader.getController();
        displayVacantUnitsController.showVacantUnits(Constant.api.getAllVacantUnits());

        screenSwitch(root, event);
    }
    public void onMakePropertyAvailableButton(ActionEvent event) throws IOException {
        screenSwitch(Constant.MAKE_PROPERTY_AVAILABLE, event);
    }
}
