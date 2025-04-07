module com.shourya.myfirstmavenproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shourya.myfirstmavenproject to javafx.fxml;
    exports com.shourya.myfirstmavenproject;
}