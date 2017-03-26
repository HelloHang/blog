package com.blog.converter.populators;

/**
 * Created by dan on 2017/3/26.
 */
public interface Populate<M, N>
{
    void populate(M m, N n);
}
