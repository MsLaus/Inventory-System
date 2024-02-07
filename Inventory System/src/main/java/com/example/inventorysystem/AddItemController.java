package com.example.inventorysystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class AddItemController extends Buttons implements Initializable {

    @FXML
    private TextField DescriptionT;

    @FXML
    private TextField categoryT;

    @FXML
    private TextField productIdT;

    @FXML
    private TextField productNameT;

    @FXML
    private TextField quantityT;

    private ArrayList<Item> itemList = new ArrayList<>(addItems());
    @FXML
    private Label nameLabel;


    public Item addItem(){

        final int id = Integer.parseInt(productIdT.getText());
        final String name = productNameT.getText();
        final int quantity = Integer.parseInt(quantityT.getText());
        final String description = DescriptionT.getText();
        final String category = categoryT.getText();

        Item item = new Item(id, name, quantity, description, category);
        ItemHelper.setItem(item);
        itemList.add(item);

        Dialog<String> dialog = new Dialog<>();
        dialog.setTitle("New item added!");
        dialog.setContentText("A new item was added to the inventory! Item '" + name + "' id: " + id);
        ButtonType type = new ButtonType("Ok");
        dialog.getDialogPane().getButtonTypes().add(type);
        dialog.show();
        return item;

    }

    public List<Item> addItems(){

        List<Item> ls= new ArrayList<>();

        Item item1 = new Item(1, "Nutella", 500, "Chocolate", "Sweets");

        Item item2 = new Item(1, "Milka", 250, "Chocolate", "Sweets");
        Item item3 = new Item(1, "Fineti", 300, "Chocolate", "Sweets");
        Item item4 = new Item(1, "Schogetten", 100, "Chocolate", "Sweets");
        Item item5 = new Item(1, "Poiana", 150, "Chocolate", "Sweets");
        Item item6 = new Item(1, "Primola", 100, "Chocolate", "Sweets");

        ls.add(item1);
        ls.add(item2);
        ls.add(item3);
        ls.add(item4);
        ls.add(item5);
        ls.add(item6);

        return ls;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText(NameHelper.Name);
    }
}
