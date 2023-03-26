/**
 * 
 */
/**
 * @author manish
 *
 */
module RentalSystem {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    exports gui.config;
    exports gui.controller;
    opens gui.config to javafx.fxml;
    opens gui.controller to javafx.fxml;
    exports gui.utils;
    opens gui.utils to javafx.fxml;

//    requires org.junit.jupiter.api;
}