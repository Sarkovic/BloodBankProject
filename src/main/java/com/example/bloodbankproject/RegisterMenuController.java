package com.example.bloodbankproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterMenuController implements Initializable {
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private ComboBox<String> bloodGroup = new ComboBox<>();
    @FXML
    private ComboBox<String> gender = new ComboBox<>();
    private String[] bloodGroupsList = {"O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-"};
    private String[] genderList = {"male", "female", "other"};
    @FXML
    private DatePicker dateOfBirth;
    @FXML
    private TextField weight;
    @FXML
    private TextField email;
    @FXML
    private TextField mobileNum;
    @FXML
    private TextField nidNum;
    @FXML
    private PasswordField password;
    @FXML
    private ComboBox<String> division = new ComboBox<>();
    private final String[] divisionList = {"Dhaka", "Chattogram", "Rajshahi", "Sylhet", "Barisal", "Khulna", "Rangpur",
            "Mymensingh"};
    @FXML
    private ComboBox<String> district = new ComboBox<>();
    private final String[] districtList = {"Dhaka","Faridpur","Gazipur","Gopalganj","Jamalpur","Kishoreganj","Madaripur",
            "Manikganj","Munshiganj","Mymensingh","Narayanganj","Narsingdi","Netrokona","Rajbari","Shariatpur","Sherpur","Tangail","Bogra","Joypurhat","Naogaon","Natore","Nawabganj","Pabna","Rajshahi","Sirajgonj","Dinajpur","Gaibandha","Kurigram","Lalmonirhat","Nilphamari","Panchagarh","Rangpur","Thakurgaon","Barguna","Barisal","Bhola","Jhalokati","Patuakhali","Pirojpur","Bandarban","Brahmanbaria","Chandpur","Chittagong","Comilla","Cox''s Bazar","Feni","Khagrachari","Lakshmipur","Noakhali","Rangamati","Habiganj","Maulvibazar","Sunamganj","Sylhet","Bagerhat","Chuadanga","Jessore","Jhenaidah","Khulna","Kushtia","Magura","Meherpur","Narail","Satkhira"};
    @FXML
    private Button registerButton;
    @FXML
    private Parent root;
    @FXML
    private Stage registerStage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bloodGroup.getItems().addAll(bloodGroupsList);
        gender.getItems().addAll(genderList);
        division.getItems().addAll(divisionList);
        district.getItems().addAll(districtList);
    }

    @FXML
    protected void onClickRegisterButton(ActionEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
            registerStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            registerStage.setScene(new Scene(root));
            registerStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
