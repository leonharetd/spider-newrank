package io.spider.newrank.domain;

import java.util.List;

public class WeixinParseResult {
    private boolean success;
    private List<WeixinData> value;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<WeixinData> getValue() {
        return value;
    }

    public void setValue(List<WeixinData> value) {
        this.value = value;
    }
}
