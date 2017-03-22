package com.blog.models;

/**
 * Created by dan on 2017/3/20.
 */
public enum ArticleStatus
{
    PUBLISHED("publiched"),

    UnPUBLISHED("unpublished");

    private String status;

    private ArticleStatus(String status)
    {
        this.setStatus(status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
