package com.knightasterial.rampup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "%s say: %s!";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Ryan") String name,
                             @RequestParam(value = "sentence", defaultValue = "Hello, World") String sentence) {
        return new Greeting(String.format(template, name, sentence));
    }
}
