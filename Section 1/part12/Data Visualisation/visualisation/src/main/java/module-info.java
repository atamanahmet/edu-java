module data.visualisation {
    requires javafx.controls;
    requires javafx.fxml;

    opens data.visualisation to javafx.fxml;
    exports data.visualisation;
}
