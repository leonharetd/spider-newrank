package io.spider.newrank.task;

import com.alibaba.fastjson.JSON;
import io.spider.newrank.domain.WeixinParseResult;
import io.spider.newrank.util.NewRankUtil;
import io.spider.newrank.webclient.DataHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class WeixinParseTask extends ParseTask {
    private static final Logger logger = LoggerFactory.getLogger(WeixinParseTask.class);
    private String uri = "/xdnphb/list/day/rank";
    private Map<String, String> params = new HashMap<>();

    public WeixinParseTask() {
        super();
        setUri(uri);
    }

    public void setStart(String start) {
        params.put("start", start);
    }

    public void setEnd(String end) {
        params.put("end", end);
    }

    public void setRankName(String rankName) {
        params.put("rank_name", rankName);
    }

    public void setRankNameGroup(String rankNameGroup) {
        params.put("rank_name_group", rankNameGroup);
    }

    public void setParam() {
        String nonce = NewRankUtil.genNonce();
        String xyz = NewRankUtil.genXYZ(uri, params, nonce);
        params.put("nonce", nonce);
        params.put("xyz", xyz);
        setParams(params);
    }

    @Override
    protected DataHandler getHandler() {
        return new WeixinDataHandler();
    }

    class WeixinDataHandler implements DataHandler {
        @Override
        public void success(String data) {
            logger.debug("======={}", data);
            WeixinParseResult result = JSON.parseObject(data, WeixinParseResult.class);
            if (result.isSuccess()) {
                logger.debug("weixin value size = {}", result.getValue().size());
            }
        }

        @Override
        public void failed() {
            logger.error("========failed");
        }
    }
}
