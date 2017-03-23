package com.blog.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by dan on 2017/3/20.
 */
@Entity
@Table(name = "authors")
public class AuthorModel extends UserModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String uid;

    @Column(nullable = true)
    private String name;

    private int age;

    private String occupation;

    private String declaration;

    @Column(unique = true)
    private String email;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    private String password;

    private String role;

    @Column(name = "portrait_path")
    private String portraitPath;

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPortraitPath() {
        return portraitPath;
    }

    public void setPortraitPath(String portraitPath) {
        this.portraitPath = portraitPath;
    }
}
