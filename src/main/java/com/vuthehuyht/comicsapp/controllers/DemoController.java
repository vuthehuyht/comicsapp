package com.vuthehuyht.comicsapp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/demo")
@RequiredArgsConstructor
public class DemoController {
    @GetMapping
    String demo() {
        return "demo api is running";
    }
}
