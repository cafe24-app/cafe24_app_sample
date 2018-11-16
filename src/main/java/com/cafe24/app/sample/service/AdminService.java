package com.cafe24.app.sample.service;

import com.cafe24.app.sample.api.request.ListAllProductsRequest;
import com.cafe24.app.sample.core.store.StoreToken;
import com.cafe24.app.sample.dto.Products;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private static final Logger log = LoggerFactory.getLogger(AdminService.class);

    @Autowired
    StoreToken storeToken;

    public Products getProducts(String mallId) {
        log.info("storeToken : storeToken : {}", storeToken.authorization(mallId));
        ListAllProductsRequest request = new ListAllProductsRequest(mallId);
        request.addHeader("Authorization", storeToken.authorization(mallId));

        Products products = request.apiCall();
        log.info("getProducts result :  {}", products.toString());

        return products;
    }
}
