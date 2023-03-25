package gui.controller.home;

import javafx.fxml.FXML;

public class HomePageController {
    @FXML
    public void onPropertyButtonClicked(){
        System.out.println("Property Button Clicked");
    }

    @FXML
    public void onTenantButtonClicked(){
        System.out.println("Tenant Button Clicked");
    }

    @FXML
    public void onLeasesButtonClicked(){
        System.out.println("Leases Button Clicked");
    }



}
