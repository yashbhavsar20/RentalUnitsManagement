package gui.controller.tenant;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AddTenantController extends SwitchScene {
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField ageField;
    @FXML private TextField emailField;

    @FXML
    public void onAddTenantButton(ActionEvent event) {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        int age = Integer.parseInt(ageField.getText().trim());
        String email = emailField.getText().trim();
        String res = Constant.api.addTenant(firstName+" "+lastName,age,email);
        System.out.println(res);
    }
    @FXML
    public void onHomeClicked(ActionEvent action) throws IOException {
        screenSwitch(Constant.HOME_SCREEN,action);
    }

}
