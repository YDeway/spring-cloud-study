package com.buck.consumer.mapper;

import com.buck.consumer.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {

    List<User> queryAllUser();

}