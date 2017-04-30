package io.spider.newrank.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class NewRankUtil {
    private static final String APP_KEY = "joker";
    private static final char[] CHAR_SOURCE = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String genNonce() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            int e = (int) Math.floor(16 * Math.random());
            sb.append(CHAR_SOURCE[e]);
        }
        return sb.toString();
    }

    public static String genXYZ(String uri, Map<String, String> params, String nonce) {
        List<String> keys = new ArrayList<>(params.keySet());
        keys.sort(String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder(uri);
        sb.append("?AppKey=").append(APP_KEY).append("&");
        for (String key : keys) {
            sb.append(key).append("=").append(params.get(key));
            sb.append("&");
        }
        sb.append("nonce=").append(nonce);
        return DigestUtils.md5Hex(sb.toString());
    }
}
