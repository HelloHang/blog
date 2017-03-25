package com.blog.services;

import com.blog.exceptions.ArticleNotFoundException;
import com.blog.models.ArticleModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * Created by dan on 2017/3/21.
 */
public interface ArticleService
{
    Page<ArticleModel> findAll(final PageRequest pageRequest);

    ArticleModel findById(final Long id);

    void update(final ArticleModel article)throws ArticleNotFoundException;

    void delete(final ArticleModel article);

    void save(final ArticleModel article);

//TODO After add AutherModel
//    Page<ArticleModel> findByAuther(final AuthorModel auther);

//    Page<ArticleModel>   findByCategory(final String category);

//    ArticleModel findByTitle(final String title);
}
