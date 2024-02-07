package com.example.inventorysystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class SettingsController extends Buttons implements Initializable {

    @FXML
    private Label nameLabel;

    public void addUser(){

        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("New user!");
        dialog.setContentText("A new user has been added.");
        ButtonType type = new ButtonType("Ok");
        dialog.getDialogPane().getButtonTypes().add(type);
        dialog.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText(NameHelper.Name);
    }
}
