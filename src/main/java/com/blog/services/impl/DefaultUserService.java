package com.blog.services.impl;

import com.blog.dao.UserRepository;
import com.blog.exceptions.EmailDuplicateException;
import com.blog.exceptions.PhoneNumberDuplicateException;
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
    public void save(UserModel userModel)throws Exception
    {
        if(findByEmail(userModel.getEmail()) != null)
        {
            throw new EmailDuplicateException("The email had been registered");
        }
        if(findByPhoneNumber(userModel.getPhoneNumber()) != null)
        {
            throw  new PhoneNumberDuplicateException("The phone number had been registered");
        }
        getUserRepository().save(userModel);
    }

    @Override
    public UserModel findByEmail(String email)
    {
       return getUserRepository().findByEmail(email);
    }

    @Override
    public UserModel findByPhoneNumber(String phoneNumber)
    {
        return getUserRepository().findByPhoneNumber(phoneNumber);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
