package com.blog.facades;

import com.blog.datas.ArticleData;
import org.springframework.data.domain.Page;

/**
 * Created by dan on 2017/3/26.
 */
public interface ArticleFacade
{
    Page<ArticleData> findAll();

    ArticleData findById();

    Page<ArticleData> findByAuthorEmail(final String email);

    Page<ArticleData> findByAuthorPhone(final String phoneNumber);

    ArticleData findByTitle();
}
