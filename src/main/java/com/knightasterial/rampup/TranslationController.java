package com.knightasterial.rampup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TranslationController {
    public static final String template = "If %1$s was a doge, '%2$s' would become '%3$s'";
    public static final String requestTemplate = "https://api.funtranslations.com/translate/doge.json?text={q}";

    @GetMapping("/translate")
    public Translation translate(@RequestParam(value = "name", defaultValue = "Ryan") String name,
                             @RequestParam(value = "sentence", defaultValue = "Hello, World") String sentence) {
        System.out.println("name: " + name + ", sentence: " + sentence);
        RestTemplate restTemplate = new RestTemplate();
        FunTranslate result = restTemplate.getForObject(requestTemplate, FunTranslate.class, sentence);
        System.out.println("result: \n" + result);
        return new Translation(String.format(template, name, sentence, result.getContents().getTranslated()));
    }
}
