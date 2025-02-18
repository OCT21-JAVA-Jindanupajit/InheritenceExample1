package com.company;


import java.math.RoundingMode;
import java.text.NumberFormat;

public abstract class Product {
    private String code;
    private String description;
    private double price;

    public Product() {
        code = "";
        description = "";
        price = 0.0;
    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product) obj;
        return super.equals(obj)&&
                code.equals(product.getCode()) &&
                description.equals(product.getDescription()) &&
                (price == product.getPrice());
    }

    // Get and set accessors for the code, description, and price instance variables
    @Override
    public String toString() {
        return  "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.HALF_UP);
        return nf.format(price);
    }
    public String returnFormattedPrice()
    {
        return getFormattedPrice();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
