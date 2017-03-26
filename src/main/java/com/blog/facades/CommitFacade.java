package com.blog.facades;

import com.blog.datas.CommitData;
import org.springframework.data.domain.Page;

/**
 * Created by dan on 2017/3/26.
 */
public interface CommitFacade
{
    Page<CommitData> findAll();

    CommitData fingById(final Long id);

    Page<CommitData> findByArticleTitle(final String title);

    Page<CommitData> findByAuthorEmail(final String email);

    Page<CommitData> findByAuthorPhone(final String phoneNumber);
}
