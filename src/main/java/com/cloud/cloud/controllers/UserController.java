package com.cloud.cloud.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@Slf4j
public class UserController {

    @SendTo("/global-message/tick")
    @MessageMapping("/from-client")
    public ResponseMessage fromClient(ClientMessage clientMessage) throws Exception {
        Thread.sleep(100);
        return new ResponseMessage(clientMessage);
    }
    @SendTo("/global-message/hello")
    @MessageMapping("/hello-client")
    public String helloClient(String client) throws Exception {
        Thread.sleep(100);
        return client;
    }

    @SendTo("/global-message/bye")
    @MessageMapping("/bye-client")
    public String byeClient(String client) throws Exception {
        Thread.sleep(100);
        return client;
    }

}



