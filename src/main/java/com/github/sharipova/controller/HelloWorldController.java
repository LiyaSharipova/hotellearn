package com.github.sharipova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liya on 01.10.17.
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        return "main";
    }
}
