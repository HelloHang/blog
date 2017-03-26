package com.blog.converter;

import com.blog.converter.populators.Populate;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by dan on 2017/3/26.
 */
public class Converter<N, T>
{
    private Populate populate;

    T convert(N n)
    {
        T t = new Class<T>().newInstance();
        if(n != null)
        {
            populate.populate(n,t);
        }
        return t;
    }

    List<T> convertAll(List<N> ns)
    {
        List<T> ts = new ArrayList<T>();
        if(!CollectionUtils.isEmpty(ns))
        {
            for(N n : ns)
            {
                T t = new T();
                populate.populate(n, t);
                ts.add(t);
            }
        }
        return ts;
    }

    public Populate getPopulate() {
        return populate;
    }

    public void setPopulate(Populate populate) {
        this.populate = populate;
    }
}
