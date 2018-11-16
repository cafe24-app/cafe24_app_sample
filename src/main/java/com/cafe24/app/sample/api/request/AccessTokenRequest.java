package com.cafe24.app.sample.api.request;

import com.cafe24.app.sample.dto.core.AccessToken;
import org.springframework.http.HttpMethod;

/**
 * AccessToken 발급
 */
public class AccessTokenRequest extends Cafe24RequestBase<AccessToken> {

    public AccessTokenRequest(String mall_id) {
        super(mall_id);
        setMethod(HttpMethod.POST);
        setPath("/api/v2/oauth/token");
    }
}
