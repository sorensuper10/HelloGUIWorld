package dk.sorensuper10.helloguiworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello Java!");
    }

    @FXML
    protected void onHelloButton2Click() {
        welcomeText.setText("Hello Datamatiker!");
    }
}