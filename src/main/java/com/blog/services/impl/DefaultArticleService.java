package com.blog.services.impl;

import com.blog.dao.ArticleRepository;
import com.blog.exceptions.ArticleNotFoundException;
import com.blog.models.ArticleModel;
import com.blog.services.ArticleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by dan on 2017/3/21.
 */
@Service
public class DefaultArticleService implements ArticleService {

    private static final Logger LOGGER = Logger.getLogger(DefaultArticleService.class);


    private ArticleRepository articleRepository;

    @Autowired
    public DefaultArticleService(ArticleRepository articleRepository)
    {
        this.articleRepository = articleRepository;
    }

    @Override
    public Page<ArticleModel> findAll(final PageRequest pageRequest)
    {
        return articleRepository.findAll(pageRequest);
    }

    @Override
    public ArticleModel findById(final Long id)
    {
        return articleRepository.findById(id);
    }

    @Override
    public void update(final ArticleModel article)throws ArticleNotFoundException
    {
        ArticleModel articleModel = articleRepository.findById(article.getId());

        if(articleModel == null)
        {
            LOGGER.error("No article found with id:" + article.getId());
            throw new ArticleNotFoundException("No article found with id:" + article.getId());
        }

        articleRepository.delete(articleModel);
        articleRepository.save(article);
    }

    @Override
    public void delete(ArticleModel article) {
        articleRepository.delete(article);
    }

    @Override
    public void save(ArticleModel article) {
        articleRepository.save(article);
    }
}
