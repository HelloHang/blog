package com.blog.services.impl;

import com.blog.dao.UserRepository;
import com.blog.models.UserModel;
import com.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dan on 2017/3/25.
 */
@Service
public class DefaultUserService implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(UserModel userModel)
    {
        getUserRepository().save(userModel);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
