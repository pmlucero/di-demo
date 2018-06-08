package guru.springframework.didemo.controller;

import guru.springframework.didemo.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    //Constructor Injected
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
