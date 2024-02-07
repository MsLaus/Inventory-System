package com.example.inventorysystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ItemController {

    @FXML
    private HBox box;

    @FXML
    private Label categoryL;

    @FXML
    private Label descriptionL;

    @FXML
    private Label nameL;

    @FXML
    private Label productIdL;

    @FXML
    private Label quantityL;

    public void setData(Item item){
        categoryL.setText(item.getCategory());
        descriptionL.setText(item.getDescription());
        nameL.setText(item.getName());
        productIdL.setText(String.valueOf(item.getId()));
        quantityL.setText(String.valueOf(item.getQuantity()));
    }
}
