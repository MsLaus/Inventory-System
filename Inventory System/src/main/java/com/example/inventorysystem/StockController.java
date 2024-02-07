package com.example.inventorysystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StockController extends Buttons implements Initializable {

    @FXML
    private VBox itemLayout;

    private List<Item> itemList;

    @FXML
    private Label nameLabel;
    Item addedItem = ItemHelper.item;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        nameLabel.setText(NameHelper.Name);

        itemList = new ArrayList<>(addItems());

        try {

            for (Item item : itemList) {

                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("item.fxml"));
                HBox itemBox = fxmlLoader.load();
                ItemController itemController = fxmlLoader.getController();
                itemController.setData(item);
                itemLayout.getChildren().add(itemBox);


            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public List<Item> addItems(){

        List<Item> ls= new ArrayList<>();

        Item item1 = new Item(123, "Nutella", 500, "Chocolate", "Sweets");

        Item item2 = new Item(125, "Milka", 250, "Chocolate", "Sweets");
        Item item3 = new Item(245, "Fineti", 300, "Chocolate", "Sweets");
        Item item4 = new Item(89, "Schogetten", 100, "Chocolate", "Sweets");
        Item item5 = new Item(301, "Poiana", 150, "Chocolate", "Sweets");
        Item item6 = new Item(287, "Primola", 100, "Chocolate", "Sweets");
        Item item7 = new Item(234, "Toffife", 230, "Chocolate", "Sweets");

        ls.add(item1);
        ls.add(item2);
        ls.add(item3);
        ls.add(item4);
        ls.add(item5);
        ls.add(item6);
        ls.add(item7);
        ls.add(addedItem);


        return ls;
    }
}
