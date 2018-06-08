package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //Setter Injected
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}