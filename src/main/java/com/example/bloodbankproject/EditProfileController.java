package com.example.bloodbankproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class EditProfileController implements Initializable {
    @FXML
    private ComboBox<String> bloodGroup = new ComboBox<>();
    @FXML
    private ComboBox<String> gender = new ComboBox<>();
    private String[] bloodGroupsList = {"O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-"};
    private String[] genderList = {"male", "female", "other"};

    public void initialize(URL arg0, ResourceBundle arg1) {
        bloodGroup.getItems().addAll(bloodGroupsList);
        gender.getItems().addAll(genderList);
    }
}
