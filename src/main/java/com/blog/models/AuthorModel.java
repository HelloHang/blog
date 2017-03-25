package com.blog.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by dan on 2017/3/20.
 */
@Entity
public class AuthorModel extends UserModel
{
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "author")
    private List<ArticleModel> articles;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "author")
    private List<CommitModel> commits;


    public List<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleModel> articles) {
        this.articles = articles;
    }

    public List<CommitModel> getCommits() {
        return commits;
    }

    public void setCommits(List<CommitModel> commits) {
        this.commits = commits;
    }


}
