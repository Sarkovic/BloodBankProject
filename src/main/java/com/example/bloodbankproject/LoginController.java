package com.example.bloodbankproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class LoginController {
    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;
    @FXML
    private Label loginTitle;

    @FXML
    protected void onLoginButtonClick(){
        loginTitle.setText("Logged in");
    }
    @FXML
    protected void onRegisterButtonClick(){
        loginTitle.setText("Registered");
    }

}