module com.event {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.event to javafx.fxml;

    exports com.event;
}
