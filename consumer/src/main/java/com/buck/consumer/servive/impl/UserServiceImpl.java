package com.buck.consumer.servive.impl;

import com.buck.consumer.entity.User;
import com.buck.consumer.mapper.UserMapper;
import com.buck.consumer.servive.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.queryAllUser();
    }
}
