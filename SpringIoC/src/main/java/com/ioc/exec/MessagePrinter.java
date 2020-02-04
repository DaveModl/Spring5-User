package com.ioc.exec;

import com.ioc.exec.service.MessageService;

public class MessagePrinter {
    private final MessageService service;

    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
