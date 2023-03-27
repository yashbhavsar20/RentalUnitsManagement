package gui.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchScene {
    public Stage stage;
    public Scene scene;
    public Parent root;
    public void screenSwitch(String filePath, ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource(filePath));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/gui/css/home-screen.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    public void screenSwitch(Parent root, ActionEvent event) throws IOException {
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/gui/css/home-screen.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

    }
}
