package gft.projects.poccucumber.controller;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public String obtainGreetingMessage(String name){
        return "hello " + name;
    }
}
