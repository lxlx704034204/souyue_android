package com.tuita.sdk.im.db.module;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import com.zhongsou.souyue.DontObfuscateInterface;

import java.io.Serializable;

/**
 * Entity mapped to table "MESSAGE_FILE".
 */
public class MessageFile implements Serializable,DontObfuscateInterface{

    public static final int DOWNLOAD_STATE_INIT = 1;            // 初始化等待中
    public static final int DOWNLOAD_STATE_LOADING = 2;         // 下载中
    public static final int DOWNLOAD_STATE_PAUSE = 3;           // 暂停中
    public static final int DOWNLOAD_STATE_FAILED = 4;          // 下载失败
    public static final int DOWNLOAD_STATE_COMPLETE = 5;        // 下载完成

    private Long id;    //
    private String name;
    private Integer type;
    private Long cursize;
    private long size;
    private Integer state;
    private Long invalidTime;
    /** Not-null value. */
    private String url;
    private String localpath;
    private Long updateTime;
    private long onlyId;

    public long getOnlyId() {
        return onlyId;
    }

    public void setOnlyId(long onlyId) {
        this.onlyId = onlyId;
    }

    public MessageFile() {
    }

    public MessageFile(Long id) {
        this.id = id;
    }

    public MessageFile(Long id, String name, Integer type, Long cursize, long size, Integer state, Long invalidTime, String url, String localpath, Long updateTime, Long onlyId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.cursize = cursize;
        this.size = size;
        this.state = state;
        this.invalidTime = invalidTime;
        this.url = url;
        this.localpath = localpath;
        this.updateTime = updateTime;
        this.onlyId = onlyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getCursize() {
        return cursize;
    }

    public void setCursize(Long cursize) {
        this.cursize = cursize;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Long invalidTime) {
        this.invalidTime = invalidTime;
    }

    /** Not-null value. */
    public String getUrl() {
        return url;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocalpath() {
        return localpath;
    }

    public void setLocalpath(String localpath) {
        this.localpath = localpath;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

}