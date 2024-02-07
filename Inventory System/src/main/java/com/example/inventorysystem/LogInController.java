package com.example.inventorysystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController extends User{

    @FXML
    private TextField nameTextField;

    @FXML
    private PasswordField passwordField;

    private Stage stage;
    private Scene scene;


    public void checkPassword(ActionEvent e) throws IOException {

        IdAndPassword();

        getLoginInfo();

        String user = nameTextField.getText();
        String password = String.valueOf(passwordField.getText());

        if(loginInfo.containsKey(user)){
            if(loginInfo.get(user).equals(password)){

                NameHelper.setName(nameTextField.getText());
                FXMLLoader loader = new FXMLLoader(getClass().getResource("home-view.fxml"));
                Parent root = loader.load();
                stage = (Stage)((Node)e.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            }else {

                Dialog<String> dialog = new Dialog<>();
                dialog.setTitle("Something went wrong!");
                dialog.setContentText("The password is not correct.");
                ButtonType type = new ButtonType("Ok");
                dialog.getDialogPane().getButtonTypes().add(type);
                dialog.show();
            }
        } else {

            Dialog<String> dialog = new Dialog<>();
            dialog.setTitle("Something went wrong!");
            dialog.setContentText("The name does not exist.");
            ButtonType type = new ButtonType("Ok");
            dialog.getDialogPane().getButtonTypes().add(type);
            dialog.show();
        }

    }
}
