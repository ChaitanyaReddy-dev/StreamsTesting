package com.example.model;

import java.util.List;

public class ProductOfferings {

    private List<ProductOffering> productOffering;

    public List<ProductOffering> getProductOffering() {
        return productOffering;
    }

    public void setProductOffering(List<ProductOffering> productOffering) {
        this.productOffering = productOffering;
    }

    @Override
    public String toString() {
        return "ProductOfferings{" +
                "productOffering=" + productOffering +
                '}';
    }
}
