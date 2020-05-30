package com.buck.consumer.servive;

import com.buck.consumer.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
}
