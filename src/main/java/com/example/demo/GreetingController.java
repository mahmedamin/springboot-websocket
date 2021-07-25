package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    public Greeting greet(HelloMessage message) {
        return new Greeting("Hello," +
                HtmlUtils.htmlEscape(message.getName()));
    }
}