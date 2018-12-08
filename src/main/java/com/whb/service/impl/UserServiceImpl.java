package com.whb.service.impl;

import com.whb.mapper.UserMapper;
import com.whb.pojo.User;
import com.whb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User query(Integer uid) {
        return userMapper.query(uid);
    }
}
