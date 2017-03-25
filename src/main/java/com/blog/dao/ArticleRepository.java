package com.blog.dao;

import com.blog.models.ArticleModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by dan on 2017/3/21.
 */
public interface ArticleRepository extends PagingAndSortingRepository<ArticleModel, Long> {

    ArticleModel findById(final Long id);

    ArticleModel findByTitle(final String title);

    Page<ArticleModel> findByCategory(final String category, final Pageable pageable);
}
