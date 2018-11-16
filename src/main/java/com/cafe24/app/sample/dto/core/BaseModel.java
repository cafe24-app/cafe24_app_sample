package com.cafe24.app.sample.dto.core;


import com.cafe24.app.sample.utils.JSONFormatter;

public class BaseModel {

    public String toJSON() {
        return JSONFormatter.toJSON(this);
    }

    @Override
    public String toString() {
        return JSONFormatter.convertJsonNode(toJSON());
    }
}
