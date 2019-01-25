package gft.projects.poccucumber.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import gft.projects.poccucumber.model.Greeting;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", required = false, defaultValue = "there") String name) {
        return new Greeting(1, greetingService.obtainGreetingMessage((name)));
    }
}
