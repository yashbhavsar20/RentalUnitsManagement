package gui.config;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.RentalSystemAPI;


public class Config extends Application implements Runnable {

    private Stage stage;
    @Override
    public void start(Stage stage) throws Exception {

//        // TODO Auto-generated method stub
        this.stage=stage;
        FXMLLoader homeLoader = new FXMLLoader();
        homeLoader.setLocation(getClass().getResource("/gui/resources/home/home-screen.fxml"));
        Scene homeScene = new Scene(homeLoader.load());
        homeScene.getStylesheets().add(getClass().getResource("/gui/css/home-screen.css").toExternalForm());
        stage.setTitle("Rental Management System");
//        stage.setFullScreen(true);
        Image icon = new Image("property-icon.png");
        stage.getIcons().add(icon);
        stage.setScene(homeScene);
        stage.show();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        launch();
    }


}
