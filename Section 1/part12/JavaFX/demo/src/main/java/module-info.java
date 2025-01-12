module com.application {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.application to javafx.fxml;

    exports com.application;
}
