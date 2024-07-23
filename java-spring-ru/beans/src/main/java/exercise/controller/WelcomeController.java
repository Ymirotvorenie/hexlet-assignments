package exercise.controller;

import exercise.daytime.Daytime;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// BEGIN
@RestController
public class WelcomeController {
    private Daytime daytime;

    public WelcomeController(Daytime daytime) {
        this.daytime = daytime;
    }

    @GetMapping(path = "/welcome")
    public String index() {
        return String.format("It is %s now! Welcome to Spring!", daytime.getName());
    }
}
// END
