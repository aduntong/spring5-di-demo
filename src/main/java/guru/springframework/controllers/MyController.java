package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/23/17.
 */
@Controller
@Slf4j
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        log.info("Hello!!! ");

        return greetingService.sayGreeting();
    }
}
