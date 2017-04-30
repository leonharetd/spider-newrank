package io.spider.newrank.webclient;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.MultiMap;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/30.
 */
public class Spider extends AbstractVerticle {
    private String host;
    private int port = 80;
    private WebClient webClient;

    public Spider() {
        VertxOptions options = new VertxOptions();
        Vertx vertx = Vertx.vertx(options);
        this.vertx = vertx;
        WebClientOptions webClientOptions = new WebClientOptions();
        WebClient webClient = WebClient.create(vertx, webClientOptions);
        this.webClient = webClient;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void post(String uri, Map<String, String> params, DataHandler handler) {
        MultiMap map = MultiMap.caseInsensitiveMultiMap();
        map.setAll(params);
        webClient.post(port, host, uri)
                .sendForm(map, event -> {
                    if (event.succeeded()) {
                        handler.success(event.result().bodyAsString());
                    } else {
                        handler.failed();
                    }
                });
    }
}
