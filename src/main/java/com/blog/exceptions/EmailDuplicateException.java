package com.blog.exceptions;

/**
 * Created by dan on 2017/3/25.
 */
public class EmailDuplicateException extends Exception
{
    public EmailDuplicateException(String message)
    {
        super(message);
    }
}
