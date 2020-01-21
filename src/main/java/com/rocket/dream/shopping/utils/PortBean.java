package com.rocket.dream.shopping.utils;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 获取端口号
 */

@Component
public class PortBean implements ApplicationListener<WebServerInitializedEvent> {
    private int serverPort;
    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        this.serverPort = event.getWebServer().getPort();
    }

    public  int getPort() {
        return this.serverPort;
    }

}
