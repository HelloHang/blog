package com.blog.services.impl;

import com.blog.dao.CommitRespository;
import com.blog.models.CommitModel;
import com.blog.services.CommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dan on 2017/3/25.
 */
@Service
public class DefaultCommitService implements CommitService
{
    @Autowired
    private CommitRespository commitRespository;

    @Override
    public void save(final CommitModel commit)
    {
        commitRespository.save(commit);
    }

    public CommitRespository getCommitRespository() {
        return commitRespository;
    }

    public void setCommitRespository(CommitRespository commitRespository) {
        this.commitRespository = commitRespository;
    }
}
