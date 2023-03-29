package gui.controller.lease;

import gui.constants.Constant;
import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import controller.RentController;
import service.RentalServices;
import javafx.scene.text.Text;
import interfaces.RentalSystemInterface;
import java.util.concurrent.TimeUnit;

import java.io.IOException;

public class RentUnitController extends SwitchScene {
    @FXML private TextField propertyIdField;
    @FXML private TextField tenantIdField;
    @FXML private TextArea leaseInfoField;
    @FXML private TextField leaseStartDateField;
    @FXML private TextField leaseEndDateField;
    @FXML private TextField rentAmountField;
    @FXML Label resLabel;

    @FXML
    public void onSubmitButton(ActionEvent event){
        String propertyID=propertyIdField.getText().trim();
        String tenantID=tenantIdField.getText().trim();
        String leaseInfo= leaseInfoField.getText().trim();
        String leaseStartDate= leaseStartDateField.getText().trim();
        String leaseEndDate= leaseEndDateField.getText().trim();
        double rentAmount= Double.parseDouble(rentAmountField.getText());
        String res= Constant.api.addRent(propertyID, tenantID, leaseInfo, leaseStartDate,
                leaseEndDate, rentAmount);
        System.out.println(res);
        resLabel.setText(res);
        //delay
//        try {
//            TimeUnit.SECONDS.sleep(5);
//            screenSwitch(Constant.HOME_SCREEN,event);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }catch(IOException ex){
//            ex.printStackTrace();
//        }
    }
    @FXML
    public void onHomeClick(ActionEvent event) throws IOException{
        screenSwitch(Constant.HOME_SCREEN,event);
    }


}
