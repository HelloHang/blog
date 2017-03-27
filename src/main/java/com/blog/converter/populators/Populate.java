package com.blog.converter.populators;

/**
 * Created by dan on 2017/3/26.
 */
public interface Populate<Source, Target>
{
    void populate(Source source, Target target);
}
