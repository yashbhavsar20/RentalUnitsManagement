package gui.controller.property;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AddPropertyController extends SwitchScene {
    String type;
    @FXML
    TextField unitNumber;
    @FXML
    TextField postalCode;
    @FXML
    TextField city;
    @FXML
    TextField province;
    @FXML
    TextField propertyID;
    @FXML
    TextField streetName;
    @FXML
    TextField streetNumber;
    @FXML
    TextField squareFoot;
    @FXML
    TextField numberOfBedrooms;
    @FXML
    TextField numberOfBathrooms;


    @FXML
    public void onHomeClicked(ActionEvent event) throws IOException {
        screenSwitch(Constant.HOME_SCREEN, event);
    }
    public void onHouseCheckClicked() {
        System.out.println("House Check Clicked");
        unitNumber.setVisible(false);
        type = "HOUSE";
    }
    public void onApartmentCheckClicked() {
        System.out.println("Apartment Check Clicked");
        unitNumber.setVisible(true);
        type = "APARTMENT";
    }
    public void onCondoCheckClicked() {
        System.out.println("Condo Check Clicked");
        unitNumber.setVisible(true);
        type = "CONDO";
    }

    public void submit(ActionEvent event){
        String res = "";
        if(type.equals("HOUSE")){
            res = Constant.api.addHouse(type, propertyID.getText(), streetName.getText(), Integer.parseInt(streetNumber.getText()),
                    city.getText(), postalCode.getText(), province.getText(),
                    Integer.parseInt(numberOfBedrooms.getText()), Integer.parseInt(numberOfBathrooms.getText()),
                    Integer.parseInt(squareFoot.getText()));
        }
        else if(type.equals("APARTMENT")){
            System.out.println("Apartment");
        }
        else if(type.equals("CONDO")){
            res = Constant.api.addCondo(type, propertyID.getText(), streetName.getText(), Integer.parseInt(streetNumber.getText()),
             city.getText(), postalCode.getText(), province.getText(), Integer.parseInt(unitNumber.getText()),
                    Integer.parseInt(numberOfBedrooms.getText()), Integer.parseInt(numberOfBathrooms.getText()),
                    Integer.parseInt(squareFoot.getText()));
        }
        System.out.println(res);
    }
}
