package com.example.inventorysystem;

public class Item {

    private int id;
    private String name;
    private int quantity;
    private String description;
    private String category;

    public Item(int id, String name, int quantity, String description, String category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}
