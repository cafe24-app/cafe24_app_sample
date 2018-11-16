package com.cafe24.app.sample.controller;


import com.cafe24.app.sample.dto.Products;
import com.cafe24.app.sample.dto.ReturnMsg;
import com.cafe24.app.sample.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    private static final Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    AdminService service;


    /**
     * 설치 스크립트 리스트 조회
     *
     * @param mall_id
     * @return
     */
    @GetMapping("/{mall_id}/products")
    public String getScripttags(@PathVariable String mall_id) {
        log.info("getScripttags : {}", mall_id);

        Products products = service.getProducts(mall_id);

        ReturnMsg returnMsg;
        if (products.getProducts().size() == 0) {
            returnMsg = new ReturnMsg(HttpStatus.NO_CONTENT.value(), HttpStatus.NO_CONTENT.name());
        } else {
            returnMsg = new ReturnMsg(products);
        }

        return returnMsg.toString();
    }

}
