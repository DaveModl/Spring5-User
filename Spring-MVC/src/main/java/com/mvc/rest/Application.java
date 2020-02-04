package com.mvc.rest;

import com.mvc.rest.service.JettyServer;

public class Application {
    public static void main(String[] args) throws Exception {
        new JettyServer().run();
    }
}
