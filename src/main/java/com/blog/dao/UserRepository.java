package com.blog.dao;

import com.blog.models.UserModel;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by dan on 2017/3/25.
 */
public interface UserRepository extends PagingAndSortingRepository<UserModel, Long>
{
    UserModel findByEmail(final String email);

    UserModel findByPhoneNumber(final String phoneNumber);
}
