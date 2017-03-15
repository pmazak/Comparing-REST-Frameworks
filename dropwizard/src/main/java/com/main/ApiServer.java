package com.main;

import com.controllers.ApiConfiguration;
import com.controllers.ApiController;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;


public class ApiServer extends Application<ApiConfiguration> {

    public static void main(String[] args) throws Exception {
        new ApiServer().run(new String[]{"server", "./dropwizard/src/main/resources/dropwizard.config.yml"});
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void run(ApiConfiguration configuration, Environment environment) throws Exception {
        final ApiController resource = new ApiController();
        environment.jersey().register(resource);
    }
}
