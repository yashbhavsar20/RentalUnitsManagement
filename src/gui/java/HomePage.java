package gui.java;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class HomePage extends Application implements Runnable {

    private Stage stage;
    @Override
    public void start(Stage stage) throws Exception {

//        // TODO Auto-generated method stub
        this.stage=stage;
        FXMLLoader homeLoader = new FXMLLoader();
        homeLoader.setLocation(getClass().getResource("/gui/resources/home/home-page.fxml"));
        Scene homeScene = new Scene(homeLoader.load(), 800, 500);
        stage.setTitle("Rental Management System");
        stage.setScene(homeScene);
        stage.show();
    }

    public void switchScene(String fxmlFile){
        FXMLLoader loader=new FXMLLoader(getClass().getResource(fxmlFile));
        if (fxmlFile.equals("add-property.fxml")){
            Scene addPropertyScene = null;
            try {
                addPropertyScene = new Scene(loader.load(), 800, 500);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Add a Property");
            this.stage.setScene(addPropertyScene);
        }
        stage.show();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        launch();
    }


}
