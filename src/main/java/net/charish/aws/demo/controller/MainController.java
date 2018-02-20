package net.charish.aws.demo.controller;

import net.charish.aws.demo.model.Demo;
import net.charish.aws.demo.model.DemoBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public Demo hello() {
        return DemoBuilder.aDemo()
                .withId(1)
                .withName("demo")
                .build();
    }

}
