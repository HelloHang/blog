package com.blog.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by dan on 2017/3/20.
 */

@Entity
@Table(name = "articles")
public class ArticleModel extends ItemModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "category", nullable = false)
    private String category;

    @Temporal(TemporalType.DATE)
    @Column(name = "create_time", nullable = false, updatable = false)
    private Date createTime;

    @Temporal(TemporalType.DATE)
    @Column(name = "modify_time", nullable = true)
    private Date modifyTime;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "article")
    private List<CommitModel> commits;

    @Column
    private String viewPicturePath;

    @Column
    private String description;

    @Enumerated(EnumType.ORDINAL)
    private ArticleStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorId")
    private AuthorModel author;

    @Column(name = "view_number")
    private Long viewNumber;

    @Column(name = "praise_number")
    private Long praiseNumber;

    @Column(name = "step_number")
    private Long stepNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public List<CommitModel> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitModel> commits) {
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

    public ArticleStatus getStatus() {
        return status;
    }

    public void setStatus(ArticleStatus status) {
        this.status = status;
    }

    public AuthorModel getAuthor() {
        return author;
    }

    public void setAuthor(AuthorModel author) {
        this.author = author;
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
        return stepNumber;
    }

    public void setStepNumber(Long stepNumber) {
        this.stepNumber = stepNumber;
    }
}
