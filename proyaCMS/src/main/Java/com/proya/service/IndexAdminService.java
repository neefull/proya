package com.proya.service;

import com.proya.dao.IndexAdminMapper;
import com.proya.entity.IndexAdmin;
import org.springframework.stereotype.Service;

/**
 * Created by wzf on 2017/5/26.
 */
@Service
public class IndexAdminService /*extends BaseService<IndexAdmin>*/ {
    private IndexAdminMapper mapper;

    public int insert(IndexAdmin indexAdmin) {
        return mapper.insert(indexAdmin);
    }
}
