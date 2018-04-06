package com.cloud.cloud.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@Slf4j
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/from-client/{chatId}")
    public void fromClient(@DestinationVariable(value = "chatId") String chatId,ClientMessage clientMessage) throws Exception {
        Thread.sleep(100);
        System.out.println(chatId);
        this.simpMessagingTemplate.convertAndSend("/global-message/tick/" + chatId, clientMessage);
    }
    @MessageMapping("/hello-client/{chatId}")
    public void helloClient(@DestinationVariable(value = "chatId") String chatId,String client) throws Exception {
        Thread.sleep(100);
        this.simpMessagingTemplate.convertAndSend("/global-message/hello/" + chatId, client);

    }

    @SendTo("/global-message/bye")
    @MessageMapping("/bye-client")
    public String byeClient(String client) throws Exception {
        Thread.sleep(100);
        return client;
    }

}



