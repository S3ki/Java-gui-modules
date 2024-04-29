module org.example.tesitjfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports View; // Export the View package
    exports Controller; // Export the Controller package
    exports Model;

    opens org.example.tesitjfx to javafx.fxml;
    exports org.example.tesitjfx;
}