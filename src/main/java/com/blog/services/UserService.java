package com.blog.services;

import com.blog.models.UserModel;
import org.apache.catalina.User;

/**
 * Created by dan on 2017/3/25.
 */
public interface UserService
{
    void save(final UserModel userModel)throws  Exception;

    UserModel findByEmail(final String email);

    UserModel findByPhoneNumber(final String phoneNumber);
}
