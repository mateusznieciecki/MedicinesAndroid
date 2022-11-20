package com.example.aplikacjaleki;

public class Medicines {
    private String name;
    private String type;
    private String quantity;

    public Medicines(String name, String type, String quantity) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getQuantity() {
        return quantity;
    }
}
