package com.cafe24.app.sample.dto;

import com.cafe24.app.sample.dto.core.BaseModel;
import org.springframework.http.HttpStatus;

public class ReturnMsg extends BaseModel {

    private int code = HttpStatus.OK.value();
    private String message = HttpStatus.OK.name();
    private Object data;

    public ReturnMsg() {
    }

    public ReturnMsg(Object data) {
        this.data = data;
    }

    public ReturnMsg(int code, String message) {
        this.code = code;
        this.message = message;
    }
}