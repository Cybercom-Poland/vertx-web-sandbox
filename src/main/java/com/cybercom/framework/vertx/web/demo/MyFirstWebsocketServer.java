package com.cybercom.framework.vertx.web.demo;

import com.cybercom.framework.vertx.web.core.routing.annotation.Verticle;
import com.cybercom.framework.vertx.web.core.server.http.DefaultWebsocketServer;
import io.vertx.core.http.HttpServerOptions;

@Verticle
public class MyFirstWebsocketServer extends DefaultWebsocketServer {
    private static final String API_PATH = "/ws/*";

    public MyFirstWebsocketServer() {
        super(API_PATH);
    }

    @Override
    protected void configureServer(HttpServerOptions httpServerOptions) {
        httpServerOptions.setPort(8081);
    }
}
