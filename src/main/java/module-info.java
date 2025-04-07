module com.shourya.myfirstmavenproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.shourya.myfirstmavenproject to javafx.graphics;
    opens com.shourya.myfirstmavenproject.controller to javafx.fxml;
}
