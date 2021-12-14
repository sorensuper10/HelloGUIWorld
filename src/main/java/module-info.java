module dk.sorensuper10.helloguiworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.sorensuper10.helloguiworld to javafx.fxml;
    exports dk.sorensuper10.helloguiworld;
}