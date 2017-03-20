package com.blog.models;

import java.util.Date;
import java.util.List;

/**
 * Created by dan on 2017/3/20.
 */
public class ArticleModel extends ItemModel
{
    private String title;

    private String content;

    private String category;

    private Date createTime;

    private Date modifyTime;

    private List<CommitModel> commits;

    private String viewPicturePath;

    private String description;

    private ArticleStatus status;

    private AuthorModel author;

    private Long viewNumber;

    private Long praiseNumber;

    private Long StepNumber;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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

    public ArticleStatus getStatus() {
        return status;
    }

    public void setStatus(ArticleStatus status) {
        this.status = status;
    }

    public Long getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(Long viewNumber) {
        this.viewNumber = viewNumber;
    }

    public Long getPraiseNumber() {
        return praiseNumber;
    }

    public void setPraiseNumber(Long praiseNumber) {
        this.praiseNumber = praiseNumber;
    }

    public Long getStepNumber() {
        return StepNumber;
    }

    public void setStepNumber(Long stepNumber) {
        StepNumber = stepNumber;
    }

    public List<CommitModel> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitModel> commits) {
        this.commits = commits;
    }

    public AuthorModel getAuthor() {
        return author;
    }

    public void setAuthor(AuthorModel author) {
        this.author = author;
    }
}
