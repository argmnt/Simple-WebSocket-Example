package com.argmnt.websocketstarter.controller;

import com.argmnt.websocketstarter.model.AnotherSimpleMessage;
import com.argmnt.websocketstarter.model.SimpleMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public AnotherSimpleMessage publishMessage(SimpleMessage simpleMessage) throws InterruptedException {
        //Simulates a processing delay by causing the thread to sleep for one second.
        Thread.sleep(1000);
        return new AnotherSimpleMessage("Hello " + simpleMessage.getName());
    }


}
