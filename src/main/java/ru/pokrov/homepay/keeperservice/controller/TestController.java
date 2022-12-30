package ru.pokrov.homepay.keeperservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value( "${test.key}" )
    private String val;

    @RequestMapping(path = "/config", method = RequestMethod.GET)
    public String config() {
        return val;
    }
}
