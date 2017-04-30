package io.spider.newrank.domain;

import com.alibaba.fastjson.annotation.JSONField;

public class WeixinData {
    @JSONField(name = "a")
    private String rank;
    /**
     * 发布分子
     */
    @JSONField(name = "b")
    private String publish;
    /**
     * 发布分母
     */
    @JSONField(name = "c")
    private String totalPublish;
    /**
     * 总阅读数
     */
    @JSONField(name = "d")
    private String totalRead;
    /**
     * 头条
     */
    @JSONField(name = "e")
    private String headlines;
    /**
     * 平均
     */
    @JSONField(name = "f")
    private String average;
    /**
     * 总点赞数
     */
    @JSONField(name = "g")
    private String totalLike;
    /**
     * 最高
     */
    @JSONField(name = "i")
    private String highest;
    /**
     * 新榜指数
     */
    @JSONField(name = "log1p_mark")
    private String newrankIndex;
    /**
     * 微信名
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 微信帐号
     */
    @JSONField(name = "account")
    private String account;
    @JSONField(name = "rank_mark")
    private String rankMark;
    @JSONField(name = "uid")
    private String uid;
    @JSONField(name = "uuid")
    private String uuid;
    @JSONField(name = "month_top_times")
    private String monthTopTimes;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getTotalPublish() {
        return totalPublish;
    }

    public void setTotalPublish(String totalPublish) {
        this.totalPublish = totalPublish;
    }

    public String getTotalRead() {
        return totalRead;
    }

    public void setTotalRead(String totalRead) {
        this.totalRead = totalRead;
    }

    public String getHeadlines() {
        return headlines;
    }

    public void setHeadlines(String headlines) {
        this.headlines = headlines;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public String getTotalLike() {
        return totalLike;
    }

    public void setTotalLike(String totalLike) {
        this.totalLike = totalLike;
    }

    public String getHighest() {
        return highest;
    }

    public void setHighest(String highest) {
        this.highest = highest;
    }

    public String getNewrankIndex() {
        return newrankIndex;
    }

    public void setNewrankIndex(String newrankIndex) {
        this.newrankIndex = newrankIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRankMark() {
        return rankMark;
    }

    public void setRankMark(String rankMark) {
        this.rankMark = rankMark;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMonthTopTimes() {
        return monthTopTimes;
    }

    public void setMonthTopTimes(String monthTopTimes) {
        this.monthTopTimes = monthTopTimes;
    }
}
