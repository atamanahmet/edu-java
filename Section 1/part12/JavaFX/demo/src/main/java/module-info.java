module com.application {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens com.application to javafx.fxml;

    exports com.application;
}
