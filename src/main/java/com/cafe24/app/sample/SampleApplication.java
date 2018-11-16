package com.cafe24.app.sample;

import com.cafe24.app.sample.core.store.StoreToken;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

    /**
     * 객체 등록 - 토큰 저장소
     *
     * @return
     */
    @Bean
    public StoreToken storeToken() {
        return new StoreToken();
    }
}
