package gui.controller.property;

import gui.MusicButton;
import gui.constants.Constant;

import gui.utils.SwitchScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AddPropertyController extends SwitchScene {
    MediaPlayer mediaPlayer;
    Media musicplay = new Media("File:///C:/Users/yashb/IdeaProjects/RentalSystem/src/Music/cb.mp3");




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
    Label resLabel;

    @FXML
    public void onHomeClicked(ActionEvent event) throws IOException {
        this.mediaPlayer = new MediaPlayer(musicplay);
        this.mediaPlayer.setAutoPlay(true);
        screenSwitch(Constant.HOME_SCREEN, event);
    }
    public void onHouseCheckClicked() {
        this.mediaPlayer = new MediaPlayer(musicplay);
        this.mediaPlayer.setAutoPlay(true);

       System.out.println("House Check Clicked");
        unitNumber.setVisible(false);
        type = "HOUSE";
    }
    public void onApartmentCheckClicked() {
        this.mediaPlayer = new MediaPlayer(musicplay);
        this.mediaPlayer.setAutoPlay(true);
        System.out.println("Apartment Check Clicked");
        unitNumber.setVisible(true);
        type = "APARTMENT";
    }
    public void onCondoCheckClicked() {
        this.mediaPlayer = new MediaPlayer(musicplay);
        this.mediaPlayer.setAutoPlay(true);
        System.out.println("Condo Check Clicked");
        unitNumber.setVisible(true);
        type = "CONDO";
    }

    public void submit(ActionEvent event) throws InterruptedException, IOException {
        this.mediaPlayer = new MediaPlayer(musicplay);
        this.mediaPlayer.setAutoPlay(true);

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
//        System.out.println(res);
        resLabel.setText(res);
        if(res.equals("Property added successfully")){
            type = "";
            propertyID.setText("");
            streetName.setText("");
            streetNumber.setText("");
            city.setText("");
            postalCode.setText("");
            province.setText("");
            unitNumber.setText("");
            numberOfBedrooms.setText("");
            numberOfBathrooms.setText("");
            squareFoot.setText("");
        }
    }
}
