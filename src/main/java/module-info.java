module com.example.bloodbankproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bloodbankproject to javafx.fxml;
    exports com.example.bloodbankproject;
}