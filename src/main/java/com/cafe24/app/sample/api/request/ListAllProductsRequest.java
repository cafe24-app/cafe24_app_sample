package com.cafe24.app.sample.api.request;

import com.cafe24.app.sample.dto.Products;
import org.springframework.http.HttpMethod;

public class ListAllProductsRequest extends Cafe24RequestBase<Products> {

    public ListAllProductsRequest(String mall_id) {
        super(mall_id);
        setMethod(HttpMethod.GET);
        setPath("/api/v2/admin/products");
    }

}
