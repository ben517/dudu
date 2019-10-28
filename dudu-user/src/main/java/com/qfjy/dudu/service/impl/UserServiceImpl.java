package com.qfjy.dudu.service.impl;

import com.qfjy.dudu.mapper.UserMapper;
import com.qfjy.dudu.pojo.User;
import com.qfjy.dudu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User selectByPrimaryKey(Integer id) {

        return userMapper.selectByPrimaryKey(id);
    }
}
