package com.main;


import org.springframework.boot.builder.SpringApplicationBuilder;

import com.utils.ApiConfiguration;


public class ApiServer {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder().sources(ApiConfiguration.class).profiles("default").run();
    }
}
