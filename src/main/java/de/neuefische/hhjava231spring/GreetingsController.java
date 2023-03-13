package de.neuefische.hhjava231spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping("/de")
    public String getGreetings() {
        return "Hallo!";
    }

    @GetMapping("/en")
    public String getGreetingsInEnglish() {
        return "Hello!";
    }

}
