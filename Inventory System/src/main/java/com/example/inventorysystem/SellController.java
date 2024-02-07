package com.example.inventorysystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SellController extends Buttons implements Initializable {

    @FXML
    private TextField productNameT, productIdT;
    @FXML
    private Label nameLabel;

    public void selling(){

        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("Items deleted!");
        dialog.setContentText("You sold item '"+ productNameT.getText() + "' id: " + productIdT.getText());
        ButtonType type = new ButtonType("Ok");
        dialog.getDialogPane().getButtonTypes().add(type);
        dialog.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText(NameHelper.Name);
    }
}
