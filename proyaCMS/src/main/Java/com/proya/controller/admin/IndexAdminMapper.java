package com.proya.controller.admin;

import com.proya.common.BaseDao;

/**
 * Created by wzf on 2017/5/26.
 */
public interface IndexAdminMapper /*<IndexAdmin> extends BaseDao<IndexAdmin>*/ {
    int deleteByPrimaryKey(Long userId);

    int insert(IndexAdmin record);

    int insertSelective(IndexAdmin record);

    IndexAdmin selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(IndexAdmin record);

    int updateByPrimaryKey(IndexAdmin record);
}
