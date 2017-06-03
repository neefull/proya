package com.dao;


import com.common.BaseDao;
import com.entity.User;

/**
 * Created by wzf on 2017/5/28.
 */
public interface UserMapper extends BaseDao<User> {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);
}
