package com.blog.converter;

import com.blog.converter.populators.Populate;
import com.blog.exceptions.NotFoundTargetClassException;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by dan on 2017/3/26.
 */

public class Converter<SOURCE, TARGET>
{
    private Populate populate;

    private Class<TARGET> targetClass;

    TARGET convert(SOURCE source)throws Exception
    {
        TARGET target = createTarget();
        if(source != null)
        {
            populate.populate(source,target);
        }
        return target;
    }

    List<TARGET> convertAll(List<SOURCE> sources)throws Exception
    {
        List<TARGET> targets = new ArrayList<TARGET>();
        if(!CollectionUtils.isEmpty(sources))
        {
            for(SOURCE source : sources)
            {
                targets.add(convert(source));
            }
        }
        return targets;
    }

    protected TARGET createTarget()throws Exception
    {
        if(getTargetClass() == null)
        {
            throw new NotFoundTargetClassException("Target Class is empty.");
        }

        return getTargetClass().newInstance();
    }

    public Populate getPopulate() {
        return populate;
    }

    public void setPopulate(Populate populate) {
        this.populate = populate;
    }

    public Class<TARGET> getTargetClass() {
        return targetClass;
    }

    public void setTargetClass(Class<TARGET> targetClass) {
        this.targetClass = targetClass;
    }
}
