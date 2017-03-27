package com.blog.datas;

import java.util.List;

/**
 * Created by dan on 2017/3/26.
 */
public class ArticleData
{
    private String title;

    private String content;

    private String createTime;

    private String modifyTime;

    private List<CommitData> commits;

    private String viewPicturePath;

    private String description;

    private AuthorData authorData;

    private Long viewNumber;

    private Long praiseNumber;

    private Long stepNumber;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public List<CommitData> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitData> commits) {
        this.commits = commits;
    }

    public String getViewPicturePath() {
        return viewPicturePath;
    }

    public void setViewPicturePath(String viewPicturePath) {
        this.viewPicturePath = viewPicturePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AuthorData getAuthorData() {
        return authorData;
    }

    public void setAuthorData(AuthorData authorData) {
        this.authorData = authorData;
    }

    public Long getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(Long viewNumber) {
        this.viewNumber = viewNumber;
    }

    public Long getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(Long stepNumber) {
        this.stepNumber = stepNumber;
    }

    public Long getPraiseNumber() {
        return praiseNumber;
    }

    public void setPraiseNumber(Long praiseNumber) {
        this.praiseNumber = praiseNumber;
    }
}
