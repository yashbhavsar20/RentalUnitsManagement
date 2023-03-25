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
    exports gui.java;
    exports gui.controller.home;
    opens gui.java to javafx.fxml;
    opens gui.controller.home to javafx.fxml;

//    requires org.junit.jupiter.api;
}