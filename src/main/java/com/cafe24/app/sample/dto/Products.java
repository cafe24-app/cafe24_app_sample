package com.cafe24.app.sample.dto;

import com.cafe24.app.sample.dto.core.BaseModel;

import java.util.List;

public class Products extends BaseModel {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
