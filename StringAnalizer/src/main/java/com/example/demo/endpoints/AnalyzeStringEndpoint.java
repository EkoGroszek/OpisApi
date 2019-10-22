package com.example.demo.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analizeString")
public class AnalyzeStringEndpoint {

    @GetMapping("/lowerCase/{text}")
    public Boolean ifContainsLowerCase(@PathVariable String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    @GetMapping("/upperCase/{text}")
    public Boolean ifContainsUpperCase(@PathVariable String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    @GetMapping("/special/{text}")
    public Boolean ifContainsSpecial(@PathVariable String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isJavaLetterOrDigit(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    @GetMapping("/digit/{text}")
    public Boolean ifContainsDigit(@PathVariable String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    @GetMapping("/phrase/{text}/{phraseToAnalize}")
    public Boolean ifContainsPhrase(@PathVariable String text, @PathVariable String phraseToAnalize) {
        if (text.contains(phraseToAnalize)) {
            return true;
        }
        return false;
    }
    
}
