module com.viewexamples {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.viewexamples to javafx.fxml;

    exports com.viewexamples;
}
