package com.proya.dao;


import com.proya.entity.User;

/**
 * Created by wzf on 2017/5/28.
 */
public interface UserMapper {

    int insert(User record);
    int selectByPrimaryKey(User record);
}
