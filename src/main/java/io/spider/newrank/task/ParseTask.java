package io.spider.newrank.task;

import io.spider.newrank.webclient.DataHandler;
import io.spider.newrank.webclient.Spider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public abstract class ParseTask implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(ParseTask.class);

    private Spider spider;
    private String uri;
    private Map<String, String> params;
    private DataHandler handler;

    public ParseTask() {
        spider = new Spider();
        spider.setHost("www.newrank.cn");
    }

    protected void setUri(String uri) {
        this.uri = uri;
    }

    protected void setParams(Map<String, String> params) {
        this.params = params;
    }

    protected void setHandler(DataHandler handler) {
        this.handler = handler;
    }

    protected abstract DataHandler getHandler();

    @Override
    public void run() {
        try {
            spider.post(uri, params, getHandler());
        } catch (Exception e) {
            logger.error("解析失败: uri={}, params={}", uri, params, e);
        }
    }
}
