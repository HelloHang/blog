package com.blog.facades;

import com.blog.datas.AuthorData;
import org.springframework.data.domain.Page;

/**
 * Created by dan on 2017/3/26.
 */
public interface UserFacade
{
    Page<AuthorData> findAll();

    AuthorData findByEmail(final String email);

    AuthorData findByPhone(final String phone);
}
