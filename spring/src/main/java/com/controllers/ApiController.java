package com.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {

    @RequestMapping(method = GET, path = "/hello")
    public String hello() {
        return "{count: " + new Random().nextInt(999) + "}";
    }
}
