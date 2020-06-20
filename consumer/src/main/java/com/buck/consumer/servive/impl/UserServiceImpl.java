package com.buck.consumer.servive.impl;

import com.buck.consumer.entity.User;
import com.buck.consumer.mapper.UserMapper;
import com.buck.consumer.servive.UserService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    @Override
    public List<User> getAllUser() {
        return userMapper.queryAllUser();
    }


    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

}
