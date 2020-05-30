package com.example.model;

public class Body {

    private ProductOfferings productOfferings;

    public ProductOfferings getProductOfferings() {
        return productOfferings;
    }

    public void setProductOfferings(ProductOfferings productOfferings) {
        this.productOfferings = productOfferings;
    }

    @Override
    public String toString() {
        return "Body{" +
                "productOfferings=" + productOfferings +
                '}';
    }
}
