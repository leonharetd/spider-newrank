package io.spider.newrank;

import io.spider.newrank.util.NewRankUtil;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        String nonce = NewRankUtil.genNonce();
        Map<String, String> params = new HashMap<>();
        params.put("end", "2017-04-30");
        params.put("rank_name", "时事");
        params.put("rank_name_group", "资讯");
        params.put("start", "2017-04-30");
        String xyz = NewRankUtil.genXYZ("/xdnphb/list/day/rank", params, nonce);
        System.out.println(nonce);
        System.out.println(xyz);
    }
}
