package com.example.inventorysystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReportController extends Buttons implements Initializable {
    @FXML
    private Label nameLabel;
    @FXML
    private TextArea textArea;

    public void reportAction(){

        try {
            //Create a file named after the user's name + report
            FileWriter myWriter = new FileWriter(nameLabel.getText()+"Report");
            myWriter.write(textArea.getText());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");


        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("You reported a problem!");
        dialog.setContentText("Thank you for your report. The issue will be fixed any time soon.");
        ButtonType type = new ButtonType("Ok");
        dialog.getDialogPane().getButtonTypes().add(type);
        dialog.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText(NameHelper.Name);
    }
}
