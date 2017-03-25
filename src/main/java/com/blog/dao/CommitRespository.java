package com.blog.dao;

import com.blog.models.CommitModel;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by dan on 2017/3/25.
 */
public interface CommitRespository extends PagingAndSortingRepository<CommitModel, Long>
{

}
