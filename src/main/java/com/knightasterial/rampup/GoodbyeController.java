package com.knightasterial.rampup;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GoodbyeController {

    @RequestMapping("/")
    public String index() {
        return "Goodbye!!!";
    }

}