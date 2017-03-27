package com.blog.facades.impl;

import com.blog.converter.Converter;
import com.blog.datas.ArticleData;
import com.blog.facades.ArticleFacade;
import com.blog.models.ArticleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by dan on 2017/3/26.
 */
@Component
public class DefaultArticleFacade implements ArticleFacade
{
    @Resource
    private Converter<ArticleModel, ArticleData> articleConverter;

    @Override
    public Page<ArticleData> findAll() {
        return null;
    }

    @Override
    public ArticleData findById() {
        return null;
    }

    @Override
    public Page<ArticleData> findByAuthorEmail(String email) {
        return null;
    }

    @Override
    public Page<ArticleData> findByAuthorPhone(String phoneNumber) {
        return null;
    }

    @Override
    public ArticleData findByTitle() {
        return null;
    }

    public Converter<ArticleModel, ArticleData> getArticleConverter() {
        return articleConverter;
    }

    public void setArticleConverter(Converter<ArticleModel, ArticleData> articleConverter)
    {
        this.articleConverter = articleConverter;
    }
}
