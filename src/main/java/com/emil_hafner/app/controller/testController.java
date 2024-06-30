package com.emil_hafner.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class testController {



    @GetMapping
    public String test() {
        return "Hello World";
    }



}
