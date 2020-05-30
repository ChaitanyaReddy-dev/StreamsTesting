package com.example.model;

public class ProductOffering {

    private int productId;
    private String productName;

    private PoCharecteristics poCharecteristics;


    public PoCharecteristics getPoCharecteristics() {
        return poCharecteristics;
    }

    public void setPoCharecteristics(PoCharecteristics poCharecteristics) {
        this.poCharecteristics = poCharecteristics;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductOffering{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }
}
