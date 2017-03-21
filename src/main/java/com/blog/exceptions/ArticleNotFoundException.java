package com.blog.exceptions;

/**
 * Created by dan on 2017/3/21.
 */
public class ArticleNotFoundException extends Exception {
    public ArticleNotFoundException(String message) {
        super(message);
    }
}
