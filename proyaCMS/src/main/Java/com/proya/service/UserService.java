package com.proya.service;

import com.proya.dao.UserMapper;
import com.proya.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wzf on 2017/5/28.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    public int insert(User user) {
        return mapper.insert(user);
    }
}
